package gov.mendoza.salud.hvt.workforce.slot.data

import gov.mendoza.salud.hvt.workforce.employee.Employee
import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPA
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class SlotJPA (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Long? = null,
    val start: LocalDateTime? = null,
    val end: LocalDateTime? = null,
    @ManyToOne val employee: EmployeeJPA? = null,
    val active:Boolean? = null
    )