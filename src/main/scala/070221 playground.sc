println(math.pow(2, 8)) //this explains why 32 bit systems are not sufficient
val b = 10
val a = 5+6
println(a+b)

var myVar = 50
myVar = myVar + 30
println(myVar)

val result = a + b //name our variables with lowercase letters
val bigResult = myVar + math.pow(2,16) //if variable has 2 or more letters we use camelCaseReallyLong

//double is really double sizes floating point number
println(result.getClass, bigResult.getClass)
//we have string
val myName = "Zanete"
println(myName, myName.getClass)
val singleChar = 'v' //use ' for chars
println(singleChar, singleChar.getClass)
val myByte : Byte = 120
println(myByte, myByte.getClass)
println(myByte + 10)
val anotherByte : Byte = 10
val resultByte = (myByte + anotherByte).toByte
//possible to cast one data type to another (not all conversions will work)
val myNumberString = "125628"
val myNumber = myNumberString.toInt

println(myNumberString, myNumber)//printing doesn't show these are 2 different data types
println(myNumberString.getClass, myNumber.getClass)