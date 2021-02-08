package gov.mendoza.salud.hvt.workforce.slot

import gov.mendoza.salud.hvt.workforce.employee.Employee
import java.time.LocalDateTime

interface SlotRepository {
    fun save(slot:Slot)
    fun modify(slot:Slot)
    fun findByEmployeeAndPeriod(employee: Employee, start: LocalDateTime, end:LocalDateTime):List<Slot>
}