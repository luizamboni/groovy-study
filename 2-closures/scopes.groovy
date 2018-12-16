a = 0

// always return last evaluated line
// closure can get variables in parent scope
addInA = { -> a + 1 }

println addInA()


add2 = { x -> x + 2 }


println add2(a)

// "it" is a implicit parameter from closure
// if you not whant declare it
multi3 = { it * 3 }

multi3AndAdd2 = multi3 >> add2

assert multi3AndAdd2(2) == add2(multi3(2))

println multi3AndAdd2(2)


// expliciting type
sumNotConcatenate = { Number x, Number y -> x + y }

println sumNotConcatenate(10, 3)

try {
  println sumNotConcatenate('a', 'b')
} catch (Exception e) {
  println e.message
}
