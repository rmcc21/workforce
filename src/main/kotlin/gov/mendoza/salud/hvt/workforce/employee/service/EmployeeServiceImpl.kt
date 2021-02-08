package gov.mendoza.salud.hvt.workforce.employee.service

import gov.mendoza.salud.hvt.workforce.employee.EmployeeRepository
import gov.mendoza.salud.hvt.workforce.employee.EmployeeService
import io.micronaut.context.annotation.Prototype
import javax.inject.Inject

@Prototype
class EmployeeServiceImpl : EmployeeService() {
    @Inject override lateinit var employeeRepository: EmployeeRepository
}