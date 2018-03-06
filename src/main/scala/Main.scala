object Main extends App {
  override def main(args: Array[String]): Unit = {
    var cashierMachine = new CashierMachine()

    while (true) {
      var entry = scala.io.StdIn.readLine("> ")

      cashierMachine = entry.split(",").toList.map(e => e.trim).foldLeft(cashierMachine){
        (cashierMch, currentEntry) => cashierMch.enter(currentEntry)
      }

      println(cashierMachine.total)
    }
  }

}
