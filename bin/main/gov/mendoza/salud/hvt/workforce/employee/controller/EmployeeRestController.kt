package gov.mendoza.salud.hvt.workforce.employee.controller

import gov.mendoza.salud.hvt.workforce.employee.Employee
import gov.mendoza.salud.hvt.workforce.employee.EmployeeController
import gov.mendoza.salud.hvt.workforce.employee.EmployeeService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("/employee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class EmployeeRestController: EmployeeController {
    @Inject lateinit var employeeService: EmployeeService

    @Put
    override fun save(employee: Employee) {
        employeeService.save(employee)
    }

    @Delete
    override fun delete(id: Long) {
        employeeService.delete(id)
    }

    @Get("/{id}")
    override fun findById(@PathVariable id: Long): Employee {
        return employeeService.findById(id)
    }
    @Get
    override fun findAll(): List<Employee> {
        return employeeService.findAll()
    }

}