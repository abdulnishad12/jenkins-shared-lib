

properties( [
       parameters([
               text(name:'credentials_file', defaultValue:'127.0.0.7 test test', description:'string')
       ])
] )

@Library('jenkins-shared-lib@master') _
 pipeline {
    agent any
    stages {
        stage('Generate Json File') {
         when {
          def cred=stageParams.credentials_file
          String[] splitData = cred.split("\n");
          for (String eachSplit : splitData) {
           def line = "${eachSplit}".split()
           def a =null;
           if ("${line[1]}" == 'test'){
            a=true
           }
           else{
            a=false
           }
           expression { return params.FORCE_FULL_BUILD }
          }
            steps {
            generateJson(
                credentials_file: "127.0.0.1 abd cef"
                )
            }
        }
        stage('Print Json File') {
            steps {
            api_call(
                api_json: 'api.json'
                )
            }
        }
    }
 }
