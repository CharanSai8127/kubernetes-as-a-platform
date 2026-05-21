pipeline {
    agent any

    stages {

        stage('Build Image') {
            steps {
                sh 'docker build -t backend:latest .'
            }
        }

        stage('Trivy Image Scan') {
            steps {
                sh 'trivy image backend:latest'
            }
        }
    }
}
