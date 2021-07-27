//Declarative
pipeline {

  agent any

  stages {

    stage('Build') {
      steps {
        echo 'Build'
        echo '$PATH'
        echo 'BUILD NUMBER - $env.BUILD_NUMBER'
        echo 'BUILD_ID - $env.BUILD_ID'
      }
    }

    stage('Test') {
      steps {
        echo "Test"
      }
    }

    stage('Integration Test') {
      steps {
        echo "Integration Test"
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
