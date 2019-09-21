def call(Map stageParams) {
 def cred=stageParams.credentials.file
 String[] splitData = cred.split("\n");
 for (String eachSplit : splitData) {
 def line = "${eachSplit}".split()
 def pass = powershell label: '', returnStatus: true, script: ".\\decrypt.ps1 ${line[0]}.encrypt"
def json = withEnv(["VAR_A=${line[0]}","VAR_B=${pass}"]){ powershell label: '', script: ''' @{ ip= "$env:VAR_B"; domain= "block64.local"; username= "Administrator"; password= "$env:VAR_A"; system_type= "win"; timeout= 90 } | ConvertTo-Json -Compress > api.json '''

  }
