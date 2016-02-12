package syskamk2.SPU

abstract class PE(val coordinate:Tuple3[Int, Int, Int])
{
  def init()
  def clock()
  def reconfigure()
  def configure()
  def status()
}

case class Exe(override val coordinate:Tuple3[Int, Int, Int]) extends PE(coordinate)
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
