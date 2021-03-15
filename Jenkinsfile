node {
   stage('Preparation') {
      git 'https://github.com/bk-104/SimpleWebApp'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}
