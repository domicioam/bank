trait Statement()
case class Deposit(amount: Int) extends Statement
case class Withdraw(amount: Int) extends Statement
