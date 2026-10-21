package com.resukisu.resukisu.domain.usecase

import java.io.File
import com.resukisu.resukisu.data.logging.BugreportRepository

class GenerateBugreportUseCase(
    private val repository: BugreportRepository,
) {
    operator fun invoke(): File = repository.create()
}
