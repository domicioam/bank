class MockPresenter(val output: List[String]) extends Presenter:
  def present(statements: List[Statement]): Unit = ???

object MockPresenter:
  def apply() = new MockPresenter(List.empty)
