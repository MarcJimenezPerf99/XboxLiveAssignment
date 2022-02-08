pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage("build") {
            steps {
                echo 'build the app in this step'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage("test") {
            steps {
                echo 'Run tests here'
                sh 'mvn test'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the app'
                java '-jar C:/Users/Marc.Jimenez/.jenkins/workspace/Xbox-Pipeline_master/target/PerficientGDCSeleniumFrameworkMaven-0.0.1-SNAPSHOT'
            }
        }
    }
    post {
        always {
            // junit 'C:/Users/Marc.Jimenez/.jenkins/workspace/Xbox-Pipeline_master/target/surefire-reports/*.xml'
        }
    }
}