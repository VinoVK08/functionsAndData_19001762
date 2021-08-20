import scala.collection._

object Q2_substraction extends App{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  print(" value of x-y-z: ")
  println(x-y-z)
}


class Rational (n:Int, d:Int){
require(d>0, "Denominator must be positive")
val numerator = n/gcd(Math.abs(n),d)
val denominator = d/gcd(Math.abs(n),d)

private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)
def +(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator,this.denominator*r.denominator)
def neg = new Rational(-this.numerator,this.denominator)
def -(r:Rational) = this + r.neg
override def toString = numerator + "/" + denominator

}
