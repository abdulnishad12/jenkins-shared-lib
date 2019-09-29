def call(Map stageParams) {
def api_json = stageParams.api_json
def file = readFile('api.json')
 def str = file.substring(2)
print (str)
}
