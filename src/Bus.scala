package syskamk2.SPU

abstract class Bus
{
  def write(passenger:BusPassenger, address:Int, data:Int)
  def read():(Int, Int)
}

trait CtrlBusPassenger
trait ConfigurationBusPassenger
trait BusPassenger extends CtrlBusPassenger with ConfigurationBusPassenger
