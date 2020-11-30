package gov.mendoza.salud.hvt.workforce.employee

import gov.mendoza.salud.hvt.workforce.employee.Employee
import gov.mendoza.salud.hvt.workforce.employee.EmployeeRepository
import io.micronaut.context.annotation.Prototype
import java.util.logging.Level
import java.util.logging.Logger
import javax.inject.Inject

@Prototype
class EmployeeService {
    @Inject lateinit var employeeRepository: EmployeeRepository

    fun save(employee: Employee) {
        employeeRepository.save(employee)
    }

    fun delete(id: Long) {
        employeeRepository.delete(id)
    }

    fun findById(id: Long): Employee {
        return employeeRepository.findById(id);
    }

    fun findAll(): List<Employee> {
        return  employeeRepository.findAll()
    }
}