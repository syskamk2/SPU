package syskamk2.SPU


trait Data
{
}

case class Bit()
{
}

case class Bits(width:Int) extends Data
{
  var d = new Array[Bit](width)
}

