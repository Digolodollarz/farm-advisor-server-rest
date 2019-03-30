package tech.diggle.apps.farmadvisorserver
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Parameter {
    @GeneratedValue
    @Id
    val id: Long = 0
    val moistureLow = 0f
    val moistureHigh = 0f
    val temperatureLow = 0f
    val temperatureHigh = 0f
    val humidityLow = 0f
    val humidityHigh = 0f

}