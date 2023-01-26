pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/ma-haozhe/ct417assign1-remake.git'

                bat './gradlew build'
            }
        }
    }
}