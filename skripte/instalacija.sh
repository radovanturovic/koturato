function prerequisites_gvr {
  sudo apt-get install postgresql pgadmin3 autoconf automake libtool \
                       flex bison gperf gawk m4 make openssl libssl-dev \
                       postgresql-contrib
  sudo apt-get install software-properties-common
  sudo add-apt-repository ppa:brightbox/ruby-ng
  sudo apt-get update
  sudo apt-get install ruby2.4 ruby2.4-dev zlib1g-dev libxml2-dev \
                       libsqlite3-dev postgresql libpq-dev \
                       libxmlsec1-dev curl make g++
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
  echo $BKUPGVR
  cd ../serveri
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
  cd ../serveri
  git clone https://github.com/instructure/canvas-lms.git canvas
  mkdir -p canvas/djem
  cd canvas/djem
  PREFIXANJE=$(pwd)
  export GEM_HOME=$PREFIXANJE
  echo 'Џем кућица: ' $GEM_HOME
  cd ..
  echo 'Креће инсталација.'
  gem install bundler --version 1.15.3
  echo 'Бандлер је инсталиран.'
  sudo gem update --system
  echo 'Гем је ажуриран.'
  $GEM_HOME/bin/bundle install
  echo 'Инсталација потребних драгуља је готова.'
  npm install
  echo 'Инсталација нпм-ом је готова у првој фази. Додајем Кафаскрипт.'
  sudo npm install -g coffee-script@1.6.2
  echo 'Готова инсталација.'
  for config in amazon_s3 delayed_jobs domain file_store outgoing_mail \
                security external_migration; \
    do cp -v config/$config.yml.example config/$config.yml;
  done
  echo 'Готово конфиглуписање.'
  cp config/dynamic_settings.yml.example config/dynamic_settings.yml
  cp config/database.yml.example config/database.yml
  echo 'Накопирао сам неке глупости још.'
  createdb canvas_development
  echo 'Направио сам базу података.'
  $GEM_HOME/bin/bundle exec rake db:initial_setup
  echo 'Иницијално постављање података.'
  $GEM_HOME/bin/bundle exec rspec spec/models/assignment_spec.rb
  echo 'Штагод.'
  $GEM_HOME/bin/bundle exec rake canvas:compile_assets
  echo 'Све је готово сад.'
  cd $BKUPGVR
}

function glassfish_install {
  BKUPGVR=$(pwd)
  echo $BKUPGVR
  cd ../serveri
  GLSF=$(find ../rsc -name "glassfish-4.1.2*.zip" | head -n 1)
  unzip $GLSF -d .
  GLSF=$(find . -name "glass*" | head -n 1)
  mv $GLSF glassfish
  cd $BKUPGVR
}

function jdk8_install {
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
