class Account(statements: List[Statement], val balance: Int):
  def deposit(amount: Int): Account = Account(statements :+ Deposit(amount), balance + amount)

  def withdraw(amount: Int): Account =
    if amount > balance then this
    else Account(statements :+ Withdraw(amount), balance - amount)

  def getStatements(): List[Statement] = statements

object Account:
  def apply() = new Account(List.empty, 0)

  def apply(statements: List[Statement], balance: Int) = new Account(statements, balance)
