package com.ElOuedUniv.maktaba.domain.usecase

import com.ElOuedUniv.maktaba.data.model.Book
import com.ElOuedUniv.maktaba.data.repository.BookRepository

/**
 * Use Case for getting books
 * This follows the Clean Architecture principle of separating business logic
 *
 * Use Cases contain the business logic of the application and are independent
 * of the UI and data sources.
 */
class GetBooksUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(): List<Book> {
        return bookRepository.getAllBooks()
    }
}