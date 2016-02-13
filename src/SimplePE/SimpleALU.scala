package syskamk2.SPU.SimplePE

import syskamk2.SPU._

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
// vim: set ts=4 sw=4 et:
