package gov.mendoza.salud.hvt.workforce.slot.repository

import gov.mendoza.salud.hvt.workforce.employee.Employee
import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPAHelper
import gov.mendoza.salud.hvt.workforce.slot.Slot
import gov.mendoza.salud.hvt.workforce.slot.SlotRepository
import gov.mendoza.salud.hvt.workforce.slot.data.SlotJPA
import gov.mendoza.salud.hvt.workforce.slot.data.SlotJPAHelper
import java.time.LocalDateTime
import javax.inject.Inject

class SlotRepositoryImpl : SlotRepository {
    @Inject lateinit var slotRepositoryJPA:SlotRepositoryJPA
    override fun save(slot: Slot) {
        slotRepositoryJPA.save(SlotJPAHelper.toJPA(slot))
    }

    override fun modify(slot: Slot) {
        slotRepositoryJPA.save(SlotJPAHelper.toJPA(slot))
    }

    override fun findByEmployeeAndPeriod(employee: Employee, start: LocalDateTime, end: LocalDateTime):List<Slot> {
        return slotRepositoryJPA.findByIdAndStartAndEndAndActive(employee.id,start,end,true)
            .map { slotJPA -> SlotJPAHelper.toSlot(slotJPA)  }
    }


}