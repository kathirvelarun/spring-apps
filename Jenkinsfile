pipeline{
    agent any

    stages{
        stage('Build'){
        steps{
            git 'https://github.com/kathirvelarun/spring-apps.git'
            sh './mvnw clean compile'
        }
       }
    }
}