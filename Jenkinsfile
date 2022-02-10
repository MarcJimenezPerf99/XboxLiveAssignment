pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage ('Clone SCM') {
            steps {
                echo 'clone the repo'
                deleteDir()
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '928027cb-3df8-40f3-9a0d-8df7e77f9b10', url: 'https://github.com/MarcJimenezPerf99/XboxLiveAssignment.git']]])
            }
        }
        stage("build") {
            steps {
                echo 'build the app in this step'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage("test") {
            steps {
                echo 'Run tests here'
                // sh 'mvn test'
            }
            // post {
            //     success {
            //         archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
            //     }
            // }
        }
        stage("deploy") {
            steps {
                echo 'deploying the app'
                cleanWs()
                // sh 'java -jar target/PerficientGDCSeleniumFrameworkMaven-0.0.1-SNAPSHOT.jar'
            }
        }
    } 
    // post {
    //     always {
    //         junit 'target/surefire-reports/*.xml'
    //     }
    // }
}