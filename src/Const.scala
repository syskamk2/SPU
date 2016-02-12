package syskamk2.SPU

object SimpleALUOp
{
  val NOP = 0x0000
  val AND = 0x0001
  val OR  = 0x0002
}

object PECtrl
{
  val NOP = 0x00
  val INIT = 0x01
  val PROG = 0x02
  val RECONF = 0x03
  val EXEC = 0x10
  val TERMINATE = 0x20
}
