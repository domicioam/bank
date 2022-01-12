class MockPresenter(val output: List[String], var statement_list: List[Statement]) extends Presenter:
  def present(statements: List[Statement]): Presenter =
    statement_list = statements
    MockPresenter(output, statements)

object MockPresenter:
  def apply() = new MockPresenter(List.empty, List.empty)
  def apply(output: List[String], statements: List[Statement]) = new MockPresenter(output, statements)
