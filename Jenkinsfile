node {
   stage('Preparation') {
      git 'https://github.com/bk-104/SimpleWebApp.git'
   }
   stage('Build') {
      bat "./gradlew clean test"
   }
}
