package gov.mendoza.salud.hvt.workforce.slot.repository

import gov.mendoza.salud.hvt.workforce.slot.data.SlotJPA
import io.micronaut.data.repository.CrudRepository
import java.time.LocalDateTime

interface SlotRepositoryJPA : CrudRepository<SlotJPA,Long> {
    fun findByIdAndStartAndEndAndActive(id:Long?, start:LocalDateTime, end:LocalDateTime, active:Boolean):List<SlotJPA>
}