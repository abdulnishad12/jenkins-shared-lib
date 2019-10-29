@Library('shared_lib@master') _
node('master'){
    wihtEnv(['cred_file=foo']) {
        stage("cean workspace") {
            clean_ws_lin()
        }
    }
}
