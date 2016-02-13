package syskamk2.SPU.SimplePE

import syskamk2.SPU._

class SimpleController(peArray:Seq[PE]) extends Controller(peArray) with BusPassenger
{
  def init() = 
  {
    System.err.println("SimpleController.init()")
    SimpleBus.write(this, SimpleBus.BROADCAST, PECtrl.INIT)
    peArray.foreach(p => p.clock())
  }
  def program() = {}
  def execute() =
  {
    SimpleBus.write(this, SimpleBus.BROADCAST, PECtrl.EXEC)
    peArray.foreach(p => p.clock())
  }
  def reconfigure() =
  {
    SimpleBus.write(this, SimpleBus.BROADCAST, PECtrl.RECONF)
    peArray.foreach(p => p.clock())
  }
  def terminate() =
  {
    SimpleBus.write(this, SimpleBus.BROADCAST, PECtrl.TERMINATE)
    peArray.foreach(p => p.clock())
  }
}

object SimpleController
{
  def apply(PEArray:Seq[PE]) =
  {
    new SimpleController(PEArray)
  }
}

