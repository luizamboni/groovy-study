
// empty map, (need to ':' to diff from lists)
def a = [:]



a['a'] = 1
// map use dot notation to access your elements
// because this, the nav a.class.name will not work,
// a.class will return null
println a.a

println "'a.class.name' returns: ${ a.class } "
println "while 'a.className()' returns: ${ a.getClass() } "
