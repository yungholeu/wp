
package chapt6.u2

/**
 * @author abin
 */
class Equipment(val routine:Int=>Int) {
  def simulate(input:Int) = {
    print("Running simulation ...")
    routine(input)
  }
}

object Chapt_6_2_002 {
  def main(args: Array[String]):Unit = {
    val calculator = { input: Int => println("calc with " + input); input }
    val equipment1 = new Equipment(calculator)
    val equipment2 = new Equipment(calculator)
    equipment1.simulate(4)
    equipment2.simulate(6)
  }
}