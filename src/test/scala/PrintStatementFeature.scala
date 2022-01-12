import org.junit.Assert.{assertEquals, assertThat}
import org.junit.Test
import java.util.Date

class PrintStatementFeature {
  @Test
  def printStatement(): Unit =
    val calendar: Calendar = Calendar()
    val presenter: MockPresenter = MockPresenter()
    var accountService: AccountService = AccountServiceImpl(presenter, calendar, Account())

    calendar.setDate(Date(2012, 1, 10))
    accountService.deposit(1000)
    calendar.setDate(Date(2012, 1, 13))
    accountService.deposit(2000)
    calendar.setDate(Date(2012, 1, 14))
    accountService.withdraw(500)

    accountService.printStatement()
    
    assertEquals(
      List(
        "Date || Amount || Balance",
        "14/01/2012 || -500 || 2500",
        "13/01/2012 || 2000 || 3000",
        "10/01/2012 || 1000 || 1000"),
      presenter.output)
}
