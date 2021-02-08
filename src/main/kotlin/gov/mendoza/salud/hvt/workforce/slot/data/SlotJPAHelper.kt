package gov.mendoza.salud.hvt.workforce.slot.data

import gov.mendoza.salud.hvt.workforce.employee.data.EmployeeJPAHelper
import gov.mendoza.salud.hvt.workforce.slot.Slot

open class SlotJPAHelper {
    companion object {
        fun toJPA(slot: Slot):SlotJPA {
            return SlotJPA(
                slot.id,
                slot.start,
                slot.end,
                slot.employee?.let { EmployeeJPAHelper.toEmployeeJPA(it) },
                slot.active)
        }

        fun toSlot(slotJPA: SlotJPA):Slot {
            return Slot(slotJPA.id,
                slotJPA.start,
                slotJPA.end,
                slotJPA.employee?.let { EmployeeJPAHelper.toEmployee(it) },
                slotJPA.active)
        }
    }
}