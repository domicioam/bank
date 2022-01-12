import org.junit.Test
import java.util.Date
import org.junit.Assert.*
import java.time.LocalDate

class CalendarShould {
  @Test
  def setSpecifiedDate() =
      val calendar = Calendar()
      val date = LocalDate.of(2020, 10,20)
      calendar.setDate(date)
      assertEquals(date, calendar.getDate())

  @Test
  def startWithTodayAsDefault() =
    val calendar = Calendar()
    val date = LocalDate.now()
    assertEquals(date, calendar.getDate())
}
