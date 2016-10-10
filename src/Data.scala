package syskamk2.SPU

case class Bit()
{
  //ToDo 演算系実装
}

case class Bits(width:Int)
{
  var d = new Array[Bit](width)

  //ToDo ちゃんと書く
  def write(dat:Bits) =
  {
    d = dat.d;
  }
  def read():Bits = this

  //演算系
  //データセット系
}

