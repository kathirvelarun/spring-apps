//Declarative
pipeline {

  agent any

  environment {
    dockerHome = tool 'myDocker'
    mavenHome = tool 'myMaven'
    javaHome = tool 'Java11'
    PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
  }

  stages {

    stage('Checkout') {
      steps {
        echo "PATH - $PATH"
        sh 'mvn --version'
        sh 'docker version'
        sh 'java -version'
        echo "BUILD_NUMBER - $env.BUILD_NUMBER"
        echo "BUILD_TAG - $env.BUILD_TAG"
        echo "BUILD_ID - $env.BUILD_ID"
        echo "JAVA_HOME - ${env.JAVA_HOME}"
      }
    }

    stage('Complile') {
      steps {
        sh "mvn clean compile"
      }
    }

    stage('Test') {
      steps {
        sh "mvn test"
      }
    }

    stage('Integration Test') {
          steps {
            sh "mvn failsafe:integration-test failsafe:verify"
          }
    }

    stage('Package') {
      steps {
        sh "mvn package -DskipTests"
      }
    }

    stage('Build Docker Image') {
          steps {
            script {
                dockerImage = docker.build("kathirvelarun/spring-boot-apps:${env.BUILD_TAG}")
            }
          }
    }

    stage('Push Docker Image') {
          steps {
            script {
                docker.withRegistry('','dockerHub') {
                    dockerImage.push();
                    //dockerImage.push('latest');
                }
            }
          }
    }


  }

  post {
    always {
      echo "Always execute CI CD"
    }
    success {
      echo "Now my app is running fine"
    }
    failure {
      echo "My App is not running fine now"
    }
  }
}
