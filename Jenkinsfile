pipeline{
    agent any

    stages{
            stage('Build'){
                steps{
                    git 'https://github.com/kathirvelarun/spring-apps.git'
                    sh './mvnw clean compile'
                }
           }

           stage('Test'){
               steps{
                   sh './mvnw test'
               }

               post {
                    always {
                        junit '**/target/surefire-reports/TEST-*.xml'
                    }
               }
          }

         stage('Publish'){
             steps{
                 sh './mvnw package'
             }

             post {
                  success {
                      archiveArtifacts 'target/*.jar'
                  }
             }
        }

         stage('Build'){
             steps{
                 sh './mvnw spring-boot:run -Dserver.port=5001'
             }
        }

    }
}