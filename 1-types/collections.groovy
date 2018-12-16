
a = [ 1, 2, 3, 4, 5 ]


// if your want force cast to a Java Type
// a = [ 1, 2, 3, 4, 5 ] as Set

// Set a = [ 1, 2, 3, 4, 5 ]

println "$a is a ${ a.class.name }"

// like "map" in other languages
println a.collect { it * 2 }


// remains unmodified
println a


// like a filter
println a.findAll { it % 2 == 0 }


// return a first element wich match
println a.find { it % 2 == 0 }


b = []

a.forEach {
  b << it * 3
}

println b