package gov.mendoza.salud.hvt.workforce.employee

import gov.mendoza.salud.hvt.workforce.employee.Employee

interface EmployeeRepository {
    fun save(employee:Employee)
    fun delete(id:Long)
    fun findById(id:Long):Employee
    fun findAll(): List<Employee>
}