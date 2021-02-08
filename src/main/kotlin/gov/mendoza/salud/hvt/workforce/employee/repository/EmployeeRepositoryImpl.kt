package gov.mendoza.salud.hvt.workforce.employee.repository

import gov.mendoza.salud.hvt.workforce.employee.Employee
import gov.mendoza.salud.hvt.workforce.employee.EmployeeRepository
import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPA
import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPAHelper
import io.micronaut.context.annotation.Prototype
import javax.inject.Inject

@Prototype
class EmployeeRepositoryImpl: EmployeeRepository {
    @Inject lateinit var employeeJpaRopository: EmployeeJpaRopository

    override fun save(employee: Employee) {
        employeeJpaRopository.save(EmployeeJPAHelper.toEmployeeJPA(employee))
    }

    override fun delete(id: Long) {
        employeeJpaRopository.deleteById(id)
    }

    override fun findById(id: Long): Employee {
        return EmployeeJPAHelper.toEmployee(employeeJpaRopository.findById(id).get())
    }

    override fun findAll(): List<Employee> {
        return employeeJpaRopository.findAll().map {employeeJPA -> EmployeeJPAHelper.toEmployee(employeeJPA)}
    }
    

}