import org.junit.Test
import org.junit.Assert.*

import java.time.LocalDate
import java.util.Date

class AccountShould {
  @Test
  def deposit() =
    val account = Account()
    val date = LocalDate.of(2012, 1, 10)
    val newAccount = account.deposit(10, date)
    assertEquals(List(Deposit(date, 10, 10)), newAccount.getStatements())
    assertEquals(10, newAccount.balance)

  @Test
  def withdraw() =
    val account = Account()
    val date = LocalDate.of(2012, 1, 10)
    val newAccount = account.deposit(10, date).withdraw(5, date)
    assertEquals(List(Deposit(date, 10, 10), Withdraw(date, 5, 5)), newAccount.getStatements())
    assertEquals(5, newAccount.balance)

  @Test
  def notWithdrawWhenBalanceNotEnough() =
    val account = Account()
    val date = LocalDate.of(2012, 1, 10)
    val newAccount = account.deposit(10, date).withdraw(15, date)
    assertEquals(List(Deposit(date, 10, 10)), newAccount.getStatements())
    assertEquals(10, newAccount.balance)
}
