package gov.mendoza.salud.hvt.workforce.employee.data

import gov.mendoza.salud.hvt.workforce.employee.Employee

open class EmployeeJPAHelper {
    companion object {
        fun toEmployee(employeeJPA: EmployeeJPA): Employee {
            return Employee(employeeJPA.id, employeeJPA.idPerson, employeeJPA.active)
        }

        fun toEmployeeJPA(employee: Employee): EmployeeJPA {
            return EmployeeJPA(employee.id, employee.idPerson, employee.active)
        }
    }

}