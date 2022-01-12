import java.time.LocalDate

trait Statement()
case class Deposit(date: LocalDate, amount: Int, balance: Int) extends Statement
case class Withdraw(date: LocalDate, amount: Int, balance: Int) extends Statement
