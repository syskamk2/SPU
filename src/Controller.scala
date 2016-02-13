package syskamk2.SPU

abstract class Controller(val PEArray:Seq[PE])
{
  def init()
  def program()
  def execute()
  def reconfigure()
  def terminate()
}

