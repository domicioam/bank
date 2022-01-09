import java.util.Date
class Calendar(date: Date) {
  def setDate(date: Date) = Calendar(date)
  def getDate() = date
}

object Calendar:
    def apply() = new Calendar(Date())
    def apply(date: Date) = new Calendar(date)
