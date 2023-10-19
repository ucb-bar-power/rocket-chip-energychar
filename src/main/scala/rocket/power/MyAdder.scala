// See LICENSE.txt for license details.
package freechips.rocketchip.rocket.power

import chisel3._

//A n-bit adder with carry in and carry out
class MyAdder[T <: Data](dataType: T) extends Module {
  val io = IO(new Bundle {
    val in1   = Input(dataType)
    val in2    = Input(dataType)
    val out  = Output(dataType)
  })

  io.out := io.in1 +& io.in2
}