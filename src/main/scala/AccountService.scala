trait AccountService:
  def deposit(amount: Int): Unit
  def withdraw(amount: Int): Unit
  def printStatement(): Unit
