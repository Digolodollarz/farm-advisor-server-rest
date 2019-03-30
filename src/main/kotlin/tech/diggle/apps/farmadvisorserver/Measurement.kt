package tech.diggle.apps.farmadvisorserver
import java.sql.Timestamp
import java.time.Instant
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Measurement{
    @GeneratedValue
    @Id
    val id: Long = 0
    val timestamp: Timestamp = Timestamp.from(Instant.now())
    val temp: Float = 0f
    val humidity: Float = 0f
    val moisture: Float = 0f
}