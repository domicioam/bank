import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

import java.time.LocalDate
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
    val date = LocalDate.of(2012, 1, 10)
    val calendar = Calendar()
    calendar.setDate(date)
    val accountService = AccountServiceImpl(presenter, calendar, Account())
    accountService.deposit(10)
    accountService.deposit(10)
    accountService.withdraw(10)
    accountService.deposit(10)
    accountService.printStatement()
    assertEquals(
      List(Deposit(date, 10, 10), Deposit(date, 10, 20), Withdraw(date, 10, 10), Deposit(date, 10, 20)),
      presenter.statement_list)
}
