trait Quarkable {
  // return a objact with Quarkable trait
  Quarkable quark() {
    println "quark! quark!"
    return this
  }
}

trait Flyable {
  Flyable fly() {
    println "fly! fly!"
    return this
  }
}

class Duck implements Quarkable, Flyable {

}


d = new Duck()

d.fly().fly()

d.quark().quark()

d.fly().quark()