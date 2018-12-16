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



d = new Duck() as Quarkable

d.quark().quark().quark()

println d.count()
