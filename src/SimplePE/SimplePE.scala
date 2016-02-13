package syskamk2.SPU.SimplePE

import syskamk2.SPU._
import syskamk2.SPU.SimplePE._

case class SimpleExe(override val coordinate:Tuple3[Int, Int, Int]) extends PE(coordinate) with BusPassenger
{
  val alu:ALU = SimpleALU(Some(this))
  val context:ContextMemory = SimpleContextMemory()
  def init() =
  {
    System.err.println(this + ":init()")
    alu.init()
    context.init()
  }
  def clock() = {}
  def reconfigure() = {}
  def configure() = {}
  def status() = {}
}
