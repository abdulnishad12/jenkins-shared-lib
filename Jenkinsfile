@Library('jenkins-shared-lib@master') _
 pipeline {
    agent any
    stages {
        stage('Generate Json File') {
            steps {
            generateJson(
                credentials_file: "127.0.0.1 abd cef"
                )
            }
        }
        stage('Print Json File') {
            steps {
            api_json(
                api_json: 'api.json'
                )
            }
        }
    }
 }
