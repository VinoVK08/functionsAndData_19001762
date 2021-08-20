import scala.collection._
import scala.::

object Q3_transfer extends App{
val a1 = new Account("998745662v",18967,1000)
val a2 = new Account("988745662v",18968,5000)
val a3 = new Account("998756662v",18969,100)


a2.transfer(a1,1000)
println(a1)
println(a2)

}

class Account(id:String, a:Int, b:Double){
  val nic:String = id
  val accountNo:Int = a
  var balance:Double = b


  def withdraw(b:Double) =this.balance=this.balance-b
  def deposit(b:Double) =this.balance=this.balance+b
  def transfer(a:Account,b:Double)= {this.withdraw(b);a.deposit(b) }

  override def toString = "["+nic+":"+ accountNo +":"+ balance +"]"

}
