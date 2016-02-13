package syskamk2.SPU.SimplePE

import syskamk2.SPU.Bus
import syskamk2.SPU.BusPassenger

object SimpleBus extends Bus
{
  private var address = 0;
  private var data = 0;
  def write(p:BusPassenger, a:Int, d:Int)
  {
    address = a
    data = d
  }
  def read():(Int, Int) =
  {
    (address, data)
  }
}

