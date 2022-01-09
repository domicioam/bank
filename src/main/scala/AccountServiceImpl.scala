class AccountServiceImpl(presenter: Presenter, calendar: Calendar) extends AccountService:
  def deposit(amount: Int): Unit = ???
  def printStatement(): Unit = ???
  def withdraw(amount: Int): Unit = ???

object AccountServiceImpl:
  def apply(presenter: Presenter, calendar: Calendar) = new AccountServiceImpl(presenter: Presenter, calendar: Calendar)