def call(Map stageParams) {
def str = api_call
  Object.metaClass.printit { -> println org.codehaus.groovy.runtime.InvokerHelper.toString(delegate) }
  str.printit()
}
