class AccountServiceImpl(presenter: Presenter, calendar: Calendar, var account: Account) extends AccountService:
  def deposit(amount: Int): Unit = account = account.deposit(amount)
  def printStatement(): Unit = presenter.present(account.getStatements())
  def withdraw(amount: Int): Unit = account = account.withdraw(amount)

object AccountServiceImpl:
  def apply(presenter: Presenter, calendar: Calendar, account: Account) = new AccountServiceImpl(presenter, calendar, account)