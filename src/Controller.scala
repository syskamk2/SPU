package syskamk2.SPU

abstract class Controller(val PEArray:Seq[PE])
{
  //PEArray$B=i4|2=(B
  def init()
  //$B%3%s%F%-%9%H%a%b%j$K9=@.>pJsN.$79~$_(B
  def program()
  //$B1i;;3+;O;X<((B
  def execute()
  //$B%3%s%F%-%9%H@Z$jBX$(;X<((B
  def reconfigure()
  //$B1i;;Dd;_;X<((B
  def terminate()
}

