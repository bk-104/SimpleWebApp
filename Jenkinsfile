node {
   stage('Preparation') {
      git 'https://github.com/bk-104/SimpleWebApp.git'
   }
   stage('Build') {
      bat "./gradlew clean test"
   }
   stage('Deploy') {
   bat "git push https://git.heroku.com/radiant-forest-14520.git master"
   }
}
