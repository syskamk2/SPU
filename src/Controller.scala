package syskamk2.SPU

abstract class Controller(val PEArray:Seq[PE])
{
  def init()
  def program()
  def execute()
  def reconfigure()
  def terminate()
}

class SimpleController(peArray:Seq[PE]) extends Controller(peArray)
{
  def init() = 
  {
    System.err.println("SimpleController.init()")
    peArray.foreach(p => p.init())
  }
  def program() = {}
  def execute() = {}
  def reconfigure() = {}
  def terminate() = {}
}

object SimpleController
{
  def apply(PEArray:Seq[PE]) =
  {
    new SimpleController(PEArray)
  }
}

