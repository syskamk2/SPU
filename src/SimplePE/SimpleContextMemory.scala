package syskamk2.SPU.SimplePE

import syskamk2.SPU._

class SimpleContextMemory extends ContextMemory
{
  def init() = {}
  def read() = {}
  def write() = {}
}

object SimpleContextMemory
{
  def apply() =
  {
    new SimpleContextMemory()
  }
}
// vim: set ts=4 sw=4 et:
