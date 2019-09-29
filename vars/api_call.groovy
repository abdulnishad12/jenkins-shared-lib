def call(Map stageParams) {
def api_json = stageParams.api_json
def file = readFile(api_json)
print (file)
}
