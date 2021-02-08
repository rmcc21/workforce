package gov.mendoza.salud.hvt.workforce.slot

import gov.mendoza.salud.hvt.workforce.employee.Employee
import java.time.LocalDateTime

interface SlotController {
    fun generate(employee: Employee, start:LocalDateTime, end:LocalDateTime)
    fun disable(id: Long)
    fun getByEmployeeAndPeriod(employee: Employee, start: LocalDateTime, end: LocalDateTime):List<Slot>
}