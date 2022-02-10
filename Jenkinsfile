pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage ('Clone SCM') {
            steps {
                echo 'clone the repo'
                echo 'Testing'
                sh 'rm -fr Xbox-Pipeline'
                sh 'git clone https://github.com/MarcJimenezPerf99/XboxLiveAssignment.git'
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
                //sh 'java -jar C:/Users/Marc.Jimenez/.jenkins/workspace/Xbox-Pipeline_master/target/PerficientGDCSeleniumFrameworkMaven-0.0.1-SNAPSHOT.jar'
            }
        }
    } 
    // post {
    //     always {
    //         junit 'target/surefire-reports/*.xml'
    //     }
    // }
}