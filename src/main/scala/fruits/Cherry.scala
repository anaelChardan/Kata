package fruits

case class Cherry(origin: String) extends Fruit {
  override def pricesInEuro: Double = 0.75
}
