package gov.mendoza.salud.hvt.workforce.employee

import io.micronaut.context.annotation.Prototype
import javax.inject.Inject


abstract class EmployeeService {
    open lateinit var employeeRepository: EmployeeRepository

    fun save(employee: Employee) {
        employeeRepository.save(employee)
    }

    fun delete(id: Long) {
        employeeRepository.delete(id)
    }

    fun findById(id: Long): Employee {
        return employeeRepository.findById(id)
    }

    fun findAll(): List<Employee> {
        return  employeeRepository.findAll()
    }
}