pipeline {
    agent any
    tools{
        maven 'maven_3_9_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/harikamutyam/springboot.git']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t harika-docker-springboot:springboot-tag .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                       sh 'docker login -u harika -p ${dockerhubpwd}'
                   }
                   sh 'docker push harika-docker-springboot:springboot-tag'
                }
            }
        }
        
    }
}
