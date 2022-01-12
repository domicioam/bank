import java.time.format.DateTimeFormatter;

class ConsolePresenter extends Presenter:
  def present(statements: List[Statement]): Unit =
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val text = statements.reverse.map(s => s match {
      case Deposit(date, amount, balance) => s"${formatter.format(date)} || $amount || $balance"
      case Withdraw(date, amount, balance) => s"${formatter.format(date)} || -$amount || $balance"
    })
    print("Date || Amount || Balance" :: text)

  protected def print(statements: List[String]): Unit = ???
