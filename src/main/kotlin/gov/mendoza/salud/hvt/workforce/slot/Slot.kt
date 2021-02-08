package gov.mendoza.salud.hvt.workforce.slot

import gov.mendoza.salud.hvt.workforce.employee.Employee
import java.time.LocalDateTime
import java.time.Period

data class Slot (val id:Long?,
                 val start:LocalDateTime?,
                 val end:LocalDateTime?,
                 val employee:Employee?,
                 val active:Boolean?) {
}