package org.wicket.calltree.services

import org.springframework.data.domain.Page
import org.wicket.calltree.dto.TwilioNumberDto
import org.wicket.calltree.models.TwilioNumber

interface TwilioNumberService {
    fun getAllNumbers(page: Int, size: Int): Page<TwilioNumber>
    fun saveNewNumber(newNumberDto: TwilioNumberDto): TwilioNumberDto
    fun deleteNumber(numberDto: TwilioNumberDto)
    fun getAvailableNumbers(): List<TwilioNumberDto>
    fun getNumberById(id: Long): TwilioNumberDto
    fun getManyNums(active: Boolean, id: LongArray): List<TwilioNumberDto>
}