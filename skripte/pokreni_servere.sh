function virtuoso_gvr_startup {
  BKUPGVR=$(pwd)
  cd ..
  export ROOTGVR=$(pwd)
  mkdir -p logovi
  mkdir -p logovi/virtuoso
  if [ ! -z ${VIRTUOSO_PIDGVR+x} ];
    then echo "Виртуосо је покренут, убијте га прво са 'ubij:v' наредбом"; return;
  fi
  if [[ ! -e $ROOTGVR/serveri/virtuoso ]]; then
    echo "Изгледа да сервер ниси инсталирао...";
    return;
  fi
  cd $ROOTGVR/serveri/virtuoso
  PREFIXANJE=$(pwd)
  export VIRTUOSO_LOGGVR=$(echo $ROOTGVR/logovi/virtuoso/$(date +%Y.%m.%d_%H.%M.%S).gvr.log)
  cd var/lib/virtuoso/db
  ./../../../../bin/virtuoso-t -f > $VIRTUOSO_LOGGVR 2>&1 &
  export VIRTUOSO_PIDGVR=$!
  echo 'ПИД за Виртуосо сервер: ' $VIRTUOSO_PIDGVR
  echo 'Користи tl:vts [-f] за праћење стања Виртуосо сервера.'
  alias tl:vts='tail $VIRTUOSO_LOGGVR'
  alias ubij:v='unset VIRTUOSO_LOGGVR VIRTUOSO_LOGGVR; unalias tl:vts ubij:v; kill $VIRTUOSO_PIDGVR'
  cd $BKUPGVR
}

function canvas_gvr_startup {
  BKUPGVR=$(pwd)
  cd ..
  export ROOTGVR=$(pwd)
  mkdir -p logovi
  mkdir -p logovi/canvas
  if [ ! -z ${CANVAS_PIDGVR+x} ];
    then echo "Канвас је покренут, убијте га прво са 'ubij:v' наредбом"; return;
  fi
  if [[ ! -e $ROOTGVR/serveri/canvas ]]; then
    echo "Изгледа да сервер ниси инсталирао..."
    return
  fi
  cd $ROOTGVR/serveri/canvas
  export PREFIXANJE=$(pwd)
  export GEM_HOME=$(echo ${PREFIXANJE}'/djem')
  echo 'Џем кућица: ' $GEM_HOME
  export CANVAS_LOGGVR=$(echo $ROOTGVR/logovi/canvas/$(date +%Y.%m.%d_%H.%M.%S).gvr.log)
  $GEM_HOME/bin/bundle exec rails server > $CANVAS_LOGGVR 2>&1 &
  export CANVAS_PIDGVR=$!
  echo 'ПИД за Канвас сервер: ' $CANVAS_PIDGVR
  echo 'Користи tl:cnv [-f] за праћење стања Канвас сервера.'
  alias tl:cnv='tail $CANVAS_LOGGVR'
  alias ubij:c='unset CANVAS_LOGGVR CANVAS_LOGGVR GEM_HOME; unalias tl:cnv ubij:c; kill $CANVAS_PIDGVR'
  cd $BKUPGVR
}
