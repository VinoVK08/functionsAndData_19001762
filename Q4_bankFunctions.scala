import scala.collection._
import scala.::

object Q4_bankFunctions extends App{
val a1 = new Account("998745662v",18967,1000)
val a2 = new Account("988745662v",18968,5000)
val a3 = new Account("998756662v",18969,100)
val a4 = new Account("998756652v",18970,-1100)
val bank:List[Account]= List(a1, a2, a3, a4)

val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)
val totalBalance=(b:List[Account])=> bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
val interest = (b:List[Account])=>bank.map((x) => (x.nic,x.accountNo,if(x.balance>0)
(x.balance+(x.balance*0.05)) else (x.balance+(x.balance*0.1)) ))

print("List of overdraft accounts: ")
println(overdraft(bank))
print("\nTotal balance of bank: ")
println(totalBalance(bank))
print("\nList of bank accounts with interest: ")
println(interest(bank))
}

class Account(id:String, a:Int, b:Double){
  val nic:String = id
  val accountNo:Int = a
  var balance:Double = b

  override def toString = "["+nic+":"+ accountNo +":"+ balance +"]"

}
