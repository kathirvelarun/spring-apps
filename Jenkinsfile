//Declarative
pipeline {
  //agent any
  agent {
    docker {
      image 'maven:3.8.1'
    }
  }
  stages {

    stage('Build') {
      steps {
        sh './mvnw test'
        echo 'Build'
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
