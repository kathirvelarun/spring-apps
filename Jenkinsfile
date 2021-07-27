//Declarative
pipeline {

  agent any

  environment {
    dockerHome = tool 'myDocker'
    mavenHome = tool 'myMaven'
    PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
  }

  stages {

    stage('Checkout') {
      steps {
        sh 'mvn --version'
        sh 'docker version'
        echo 'Build'
        echo '$PATH'
        echo "BUILD_NUMBER - $env.BUILD_NUMBER"
        echo "BUILD_ID - $env.BUILD_ID"
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
