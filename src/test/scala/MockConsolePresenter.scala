class MockConsolePresenter(var statement_list: List[String]) extends ConsolePresenter:
  override protected def print(statements: List[String]): Unit =
    statement_list = statements

object MockConsolePresenter:
  def apply(statement_list: List[String]) =
    new MockConsolePresenter(statement_list)

