pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/example/repo.git'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'echo Running unit tests'
            }
        }

        stage('SonarQube Scan') {
            steps {
                sh 'echo Running static analysis'
            }
        }

        stage('Trivy Filesystem Scan') {
            steps {
                sh 'trivy fs .'
            }
        }

        stage('Build Docker Image') {
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
