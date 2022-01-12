import org.junit.Assert.{assertEquals, assertTrue}
import org.junit.Test

class AccountServiceShould {
  @Test
  def deposit() =
    val accountService = AccountServiceImpl(MockPresenter(), Calendar(), Account())
    accountService.deposit(10)
    assertEquals(10, accountService.account.balance)
}
