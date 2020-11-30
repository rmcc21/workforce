package gov.mendoza.salud.hvt.workforce.employee

interface EmployeeController {
    fun save(employee:Employee)
    fun delete(id:Long)
    fun findById(id:Long):Employee
    fun findAll():List<Employee>
}