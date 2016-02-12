package syskamk2.SPU

abstract class ContextMemory
{
  def init()
  def read()
  def write()
}

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
