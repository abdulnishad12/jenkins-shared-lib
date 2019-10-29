@Library('shared_lib@master') _
node('master'){
    withEnv(['cred_file=foo']) {
        stage("clean workspace") {
            clean_ws_lin()
        }
        stage("Getting Json input from the user"){
            def inputFile = input message: 'Upload file', parameters: [file(name: 'input.json')]
            writeFile(file: 'input.json', text: inputFile.readToString())
            stash name: 'data', includes: 'input.json'
            //env.cred_file = butler_input()
        }
        stage("Prepare ansible inventory for linux"){
            when {
                expression { return readFile('input.json').contains('win') }
            }
            }
            }
        }
