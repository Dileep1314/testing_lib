def call(body) {
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

  def sayHello = load 'vars/sayHello.groovy'
  sayHello.hello("World!")
}
}
 
