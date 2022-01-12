import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

import java.util.Date

class AccountServiceShould {
  @Test
  def deposit() =
    val accountService = AccountServiceImpl(MockPresenter(), Calendar(), Account())
    accountService.deposit(10)
    assertEquals(10, accountService.account.balance)

  @Test
  def withdraw() =
    val accountService = AccountServiceImpl(MockPresenter(), Calendar(), Account())
    accountService.deposit(10)
    accountService.withdraw(5)
    assertEquals(5, accountService.account.balance)

  @Test
  def printStatement() =
    val presenter = MockPresenter()
    val calendar = Calendar().setDate(Date(2012, 1, 10))
    val accountService = AccountServiceImpl(presenter, calendar, Account())
    accountService.deposit(10)
    accountService.deposit(10)
    accountService.withdraw(10)
    accountService.deposit(10)
    accountService.printStatement()
    assertEquals(List(Deposit(10), Deposit(10), Withdraw(10), Deposit(10)), presenter.statement_list)
}
