package chapt6.u3

class Underscore {
  def max2(a:Int, b:Int):Int = {
    if (a>b) a else b
  }
 
}

object Main {
 def main(arr:Array[String]):Unit = {
    val arr = Array(1,2,3,4,5)
    println("Sum of all values in array is " + (0 /: arr){
      (sum,elem)=>sum+elem
    })
    
     println("Sum of all values in array is " + (0 /: arr){_+_})
     
     println("Array has negative number? " + arr.exists { x => x<0 })
     println("Array has negative number? " + arr.exists { _<0 })
  }
 }