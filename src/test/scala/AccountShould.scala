import org.junit.Test
import org.junit.Assert.*

class AccountShould {
  @Test
  def deposit() =
    val account = Account()
    val newAccount = account.deposit(10)
    assertEquals(List(Deposit(10)), newAccount.getStatements())
    assertEquals(10, newAccount.balance)

  @Test
  def withdraw() =
    val account = Account()
    val newAccount = account.deposit(10).withdraw(5)
    assertEquals(List(Deposit(10), Withdraw(5)), newAccount.getStatements())
    assertEquals(5, newAccount.balance)

  @Test
  def notWithdrawWhenBalanceNotEnough() =
    val account = Account()
    val newAccount = account.deposit(10).withdraw(15)
    assertEquals(List(Deposit(10)), newAccount.getStatements())
    assertEquals(10, newAccount.balance)
}
