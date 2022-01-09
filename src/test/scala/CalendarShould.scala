import org.junit.Test
import java.util.Date
import org.junit.Assert.*

class CalendarShould {
  @Test
  def setSpecifiedDate() =
      val calendar = Calendar()
      val date = Date(2020, 10,20)
      val newCalendar = calendar.setDate(date)
      assertEquals(date, newCalendar.getDate())

  @Test
  def startWithTodayAsDefault() =
    val calendar = Calendar()
    val date = Date()    
    assertEquals(date, calendar.getDate())
}
