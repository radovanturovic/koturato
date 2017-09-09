BKUPGVR=$(pwd)
if [ -z ${KOTUROOT+x} ]; then
  cd $(dirname $0)/..
  export KOTUROOT=$(pwd)
  cd $BKUPGVR
else
  echo KOTUROOT већ постоји: $KOTUROOT
fi

function prerequisites_gvr {
  sudo apt-get install postgresql pgadmin3 autoconf automake libtool \
                       flex bison gperf gawk m4 make openssl libssl-dev \
                       postgresql-contrib maven libecpg-dev libkrb5-dev \
                       postgresql-server-dev-9.* g++ rpl
  sudo apt-get install software-properties-common
  sudo add-apt-repository ppa:brightbox/ruby-ng
  sudo apt-get update
  sudo apt-get install ruby2.4 ruby2.4-dev zlib1g-dev libxml2-dev \
                       libsqlite3-dev postgresql libpq-dev \
                       libxmlsec1-dev curl make g++ ruby-pg
  curl -sL https://deb.nodesource.com/setup_6.x | sudo -E bash -
  sudo apt-get install -y nodejs build-essential
  sudo -u postgres createuser $USER
  sudo -u postgres psql -c "alter user $USER with superuser" postgres
  curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -
  echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
  sudo apt-get update && sudo apt-get install yarn
}

function virtuoso_gvr_install {
  BKUPGVR=$(pwd)
  cd $KOTUROOT
  mkdir -p serveri
  cd serveri
  git clone https://github.com/openlink/virtuoso-opensource.git virtuosoi
  mkdir -p virtuoso
  cd virtuoso
  PREFIXANJE=$(pwd)
  cd ../virtuosoi
  CFLAGS="-O2 -m64"
  export CFLAGS
  ./autogen.sh
  ./configure --prefix=$PREFIXANJE
  make
  make install
  cd ..
  rm -rf virtuosoi
  cd $BKUPGVR
}

function canvas_gvr_install {
  BKUPGVR=$(pwd)
  cd $KOTUROOT
  mkdir -p serveri
  cd serveri
  curl -O https://raw.githubusercontent.com/FreedomBen/canvas-development-tools/master/CODES.sh
  rpl 'checkoutname="canvas-lms"' 'checkoutname="canvas"; alias ruby=ruby2.4' CODES.sh
  rpl 'canvasdir="$HOME"' 'canvasdir=$(echo $KOTUROOT"/serveri"); echo $canvasdir; export GEM_HOME=$KOTUROOT/serveri/canvas/djemsi' CODES.sh
  rpl 'bundle exec' '$GEM_HOME/bin/bundle exec' CODES.sh
  rpl 'bundle _' '$GEM_HOME/bin/bundle _' CODES.sh
  rpl 'bundle install' '$GEM_HOME/bin/bundle install' CODES.sh
  rpl 'bundle list' '$GEM_HOME/bin/bundle list' CODES.sh
  rpl 'which bundler' 'which $GEM_HOME/bin/bundler' CODES.sh
  rpl 'bundle config' '$GEM_HOME/bin/bundle config' CODES.sh
  rpl 'installGems || die "' 'sudo env REALLY_GEM_UPDATE_SYSTEM=1 gem update --system; installGems || die "' CODES.sh
  rpl 'sudo apt-get -y install rubygems1.9.1' 'echo -e "${green}Глупи инсталатор рубиџемсија верзије 1.9.1 је уклоњен. Слободни смо од те напасти!!! Јеееееееееееј! :D${restore}"' CODES.sh
  rpl 'sudo apt-get -y install ruby-dev' 'echo -e "${green}Глупи инсталатор рубија верзије 2.штабило што није 2.4 је уклоњен. Слободни смо од те напасти!!! Јеееееееееееј! :D${restore}"' CODES.sh
  rpl 'sudo apt-get -y sudo apt-get -y install ruby-pg' 'echo -e "${green}Глупи инсталатор рубипагана је уклоњен предострожности ради. Слободни смо од те напасти!!! Јеееееееееееј! :D${restore}"' CODES.sh
  rpl 'BUNDLE_VER=$(ruby -e "$(cat Gemfile.d/_before.rb | grep req_bundler_version | head -1); puts \"#{req_bundler_version_ceiling}\"")' \
      'BUNDLE_VER=$(ruby -e "$(cat Gemfile.d/_before.rb | grep req_bundler_version | head -1); puts \"#{req_bundler_version_ceiling}\""); BUNDLE_VER=1.14.6' CODES.sh
  rpl 'buildCanvasAssets || die ' 'rpl "File.expand_path("'"'"'"'"'"'"../.."'"'"'"'"'"'", __FILE__)" \
      "File.expand_path("'"'"'"'"'"'"../.."'"'"'"'"'"'", __FILE__).force_encoding('"'"'utf-8'"'"')" $KOTUROOT/serveri/canvas/djemsi/gems/bundler-1.14.6/lib/bundler/shared_helpers.rb; buildCanvasAssets || die ' CODES.sh
  chmod +x CODES.sh
  ./CODES.sh --full
  rm CODES.sh
  cd $BKUPGVR
  echo Све је готово!!! :\)
}

function glassfish_gvr_install {
  BKUPGVR=$(pwd)
  echo $BKUPGVR
  mkdir -p ../serveri
  cd ../serveri
  GLSF=$(find ../rsc -name "glassfish-4.1.2*.zip" | head -n 1)
  unzip $GLSF -d .
  GLSF=$(find . -name "glass*" | head -n 1)
  mv $GLSF glassfish
  cd $BKUPGVR
}

function jdk8_gvr_install {
  BKUPGVR=$(pwd)
  echo $BKUPGVR
  cd ..
  mkdir -p jdk
  cd jdk
  GLSF=$(find ../rsc -name "jdk-8u*.tar.gz" | head -n 1)
  tar -zxvf $GLSF
  GLSF=$(find . -name "jdk1.8*" | head -n 1)
  mv $GLSF jdk8
  cd $BKUPGVR
}

function pljava_gvr_install {
  BKUPGVR=$(pwd)
  export JAVA_HOME=../jdk/jdk8
  alias java=$JAVA_HOME/bin/java
  alias javac=$JAVA_HOME/bin/javac
  git clone https://github.com/tada/pljava.git pljava
  if [ $? -eq 0 ]; then
    echo ОКИ ДОКИ
    cd pljava
    mvn clean install
    if [ $? -eq 0 ]; then
      PLJAR=$(find pljava-packaging/target/ -name 'pljava-pg*.jar')
      sudo $KOTUROOT/jdk/jdk8/bin/java -jar $PLJAR
      cp -r $KOTUROOT/jdk/jdk8 /tmp/jdk8
      psql -f $KOTUROOT/skripte/sikul/.pljava-set.sql canvas_test
      rpl 'canvas_test' 'canvas_development' $KOTUROOT/skripte/sikul/.pljava-set.sql
      psql -f $KOTUROOT/skripte/sikul/.pljava-set.sql canvas_development
      rpl 'canvas_development' 'canvas_queue_development' $KOTUROOT/skripte/sikul/.pljava-set.sql
      psql -f $KOTUROOT/skripte/sikul/.pljava-set.sql canvas_queue_development
      rpl 'canvas_queue_development' 'canvas_test' $KOTUROOT/skripte/sikul/.pljava-set.sql
      psql -f $KOTUROOT/skripte/sikul/.pljava.sql canvas_test
      psql -f $KOTUROOT/skripte/sikul/.pljava.sql canvas_development
      psql -f $KOTUROOT/skripte/sikul/.pljava.sql canvas_queue_development
      cp $PLJAR $KOTUROOT/rsc/pljava.jar
    fi
  else
    echo Њаааааа...
  fi
  rm -rf pljava
  cd $BKUPGVR
}
