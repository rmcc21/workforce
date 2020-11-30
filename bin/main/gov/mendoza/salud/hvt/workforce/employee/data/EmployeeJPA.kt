package gov.mendoza.salud.hvt.workforce.employee.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class EmployeeJPA(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
        val idPerson: String? = null,
        val active: Boolean? = null)


