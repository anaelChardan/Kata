object Main extends App {
  override def main(args: Array[String]): Unit = {
    while (true) {
      var entry = scala.io.StdIn.readLine(">")
      println(s"You entered $entry")
    }
  }

}
