package syskamk2.SPU

abstract class ALU
{
  def init()
  def configure()
  def clock()
}

class SimpleALU(parent:Option[PE]) extends ALU
{
  def init() =
  {
    parent match
    {
      case Some(p) => System.err.println(p.toString + this + ".init()")
      case _ => System.err.println(this + ".init()")
    }
  }
  def configure() = {}
  def clock() = {}
  override def toString() =
  {
    this.getClass.getName
  }
}

object SimpleALU
{
  def apply():SimpleALU =
  {
    apply(None)
  }
  def apply(parent:Option[PE]) =
  {
    new SimpleALU(parent)
  }
}
