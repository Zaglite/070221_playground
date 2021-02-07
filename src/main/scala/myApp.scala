import scala.io.StdIn.readLine

object myApp extends App {
val myName = readLine("What's your name?")
  val favouriteFood = readLine(s"Hello there, $myName! What's your favourite food?") //s is tring interpolation, inserts variables and values into the string
  println(s"Cool, I like $favouriteFood as well")
  val currentPrice = readLine(s"How much is/are $favouriteFood in store now?").toFloat
  println(s"Not bad, I could buy some $favouriteFood for $currentPrice")
  val currentMoney = readLine(s"How much money do you have, $myName?").toFloat
  //TODO find out how many of our favourite food we can afford
  val maxPurchaseWeight = currentMoney / currentPrice //values must have correct data type, in this case to.Float
  //println(s"Congratualtions, $myName! You can buy ${(maxPurchaseWeight*100).round/100.toDouble} kilos of $favouriteFood right now")
  println(s"Congratualtions, $myName! You can buy ${(maxPurchaseWeight*100).round/100.0} kilos of $favouriteFood right now")
  //this is how to round result up to 2 digits after comma
  //instead of 100.toDouble we can use 100.0 - smart programmer's trick

  val isRaining = false
  val isSnowing = true
  val isCold = true
  //this is boolean data type and is used when we have to put some logic data

}
