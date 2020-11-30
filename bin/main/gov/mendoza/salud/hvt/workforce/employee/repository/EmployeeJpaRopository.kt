package gov.mendoza.salud.hvt.workforce.employee.repository

import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPA
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface EmployeeJpaRopository : CrudRepository<EmployeeJPA,Long> {
}