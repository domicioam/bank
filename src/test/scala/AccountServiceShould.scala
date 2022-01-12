import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

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
}
