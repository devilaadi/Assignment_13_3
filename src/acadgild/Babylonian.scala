package acadgild

object Babylonian {
  
  def main(args: Array[String]): Unit = {
    
    println("**************SQUARE ROOT USING Babylonian*******************")
    
    println("Enter the Number on which you have to find square root")
    
    /*
  1 Start with an arbitrary positive start value x (the closer to the 
  root, the better).
	2 Initialize y = 1.
	3. Do following until desired approximation is achieved.
  a) Get the next approximation for root using average of x and y
  b) Set y = n/x 
  */
    
//Logic
    
    val n = scala.io.StdIn.readFloat()
    
    var x = n
    var y =1.toFloat 
    var e = 0.000001 /* e decides the accuracy level*/
    
    while(x-y > e)
    {
      x = (x+y)/2
      y= n/x
    }
     println("Square Root :"+x)
    
  }
}