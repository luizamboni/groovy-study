trait Quarkable {

  public int quark_count = 0

  int count() {
    return quark_count
  }
  // return a objact with Quarkable trait
  Quarkable quark() {
    quark_count += 1
    println "quark! quark!"
    return this
  }
}


// traits are like intefaces, but with implementations
// of behavior
class Duck implements Quarkable {
}

d = new Duck()

d.quark().quark().quark()

println d.count()
