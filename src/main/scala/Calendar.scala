import java.time.{LocalDate, LocalDateTime}
class Calendar(var date: LocalDate) {
  def setDate(date: LocalDate) = this.date = date
  def getDate() = date
}

object Calendar:
    def apply() = new Calendar(LocalDate.now())
    def apply(date: LocalDate) = new Calendar(date)
