import java.time.LocalDate

class Account(statements: List[Statement], val balance: Int = 0):
  def deposit(amount: Int, date: LocalDate): Account =
    val newBalance = balance + amount
    Account(statements :+ Deposit(date, amount, newBalance), newBalance)

  def withdraw(amount: Int, date: LocalDate): Account =
    if amount > balance then this
    else
      val newBalance = balance - amount
      Account(statements :+ Withdraw(date, amount, newBalance), newBalance)

  def getStatements(): List[Statement] = statements

object Account:
  def apply() = new Account(List.empty)
  def apply(statements: List[Statement], balance: Int) = new Account(statements, balance)
