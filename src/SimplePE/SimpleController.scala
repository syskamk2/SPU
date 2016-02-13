package syskamk2.SPU.SimplePE

import syskamk2.SPU._

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

// vim: set ts=4 sw=4 et:
