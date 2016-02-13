package syskamk2.SPU.SimplePE

import syskamk2.SPU._
import syskamk2.SPU.SimplePE._

case class SimpleExe(override val coordinate:Tuple3[Int, Int, Int]) extends PE(coordinate) with BusPassenger
{
  private val (x, y, z) = coordinate
  private val alu:ALU = SimpleALU(Some(this))
  private val context:ContextMemory = SimpleContextMemory()

  def clock() =
  {
    val ctrl = readBus()
    eval(ctrl)
  }
  protected def init() =
  {
    System.err.println(this + ":init()")
    unsetExecMode()
    alu.init()
    context.init()
  }
  protected def reconfigure() = {}
  protected def configure() = {}
  def status() = {}
  private def eval(ctrl:Int)
  {
    ctrl match
    {
      case PECtrl.NOP => 
      case PECtrl.INIT => init()
      case PECtrl.PROG => configure()
      case PECtrl.RECONF => reconfigure()
      case PECtrl.EXEC => setExecMode()
      case PECtrl.TERMINATE => unsetExecMode()
      case _ => 
    }
  }
  private def setExecMode()
  {
    execMode = EXEC_ON
    System.err.println(this + ":execMode set")
  }
  private def unsetExecMode()
  {
    execMode = EXEC_OFF
    System.err.println(this + ":execMode unset")
  }
  private def readBus() =
  {
    val ((x, y, z), ctrl) = SimpleBus.read()
    (x, y, z) match
    {
      case SimpleBus.BROADCAST => ctrl
      case (this.x, this.y, this.z) => ctrl
      case _ => PECtrl.NOP
    }
  }
}
