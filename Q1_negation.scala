import scala.collection._

object Q1_negation extends App{
val x = new Rational(3,4)
val negativeValue = x.neg
print("Negative value of x: ")
println(x.neg)
}


class Rational (n:Int, d:Int){
require(d>0, "Denominator must be positive")
val numerator = n/gcd(Math.abs(n),d)
val denominator = d/gcd(Math.abs(n),d)

private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)
def neg = new Rational(-this.numerator,this.denominator)
override def toString = numerator + "/" + denominator

}
