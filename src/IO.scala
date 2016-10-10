package syskamk2.SPU

trait IO
{
}

case class I(width:Int) extends IO
{
  val d:Bits = Bits(width)
  def write(dat:Bits) {}
  //for Debug
  def read():Bits = d
}

case class O(width:Int) extends IO
{
  val d:Bits = Bits(width)
  def read():Bits = d
}
