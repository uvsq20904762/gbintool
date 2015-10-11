package fr.uvsq.doosa.gradletuto

def cli = new CliBuilder(usage: 'Main.groovy <action> [<options>] <entrée1>:<entrée2>:...')

cli.with {
  h(longOpt: 'help', 'show usage information')
  action(longOpt: 'action','une action parmi help, version, metadata, cat, sample')
  o(longOpt: 'output','destination ( sans option pour la sortie standard)')
  csv(longOpt: 'csv','sortie au format CSV(défaut)')
  parquet(longOpt: 'parquet','sortie au format Avro/Parquet')
  s(longOpt: 'size', 'taille des fichiers de sortie')
  n(longOpt: 'n1st', 'traite uniquement les n premiers objets')
  r(longOpt: 'nrand', 'traite n objets au hasard')
}

def options = cli.parse(args)
if(!options) {
  return
}

// print usage if no argument is given
if(options.h) {
  cli.usage()
}
if(options.action){
println returnHello()
}

String returnHello() {
        'Hello'
    }
	

