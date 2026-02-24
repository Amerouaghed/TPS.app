package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Book

/**
 * ==========================
 * TP1 – Exercise 4.2 Questions:
 *
 * 1. ما دور Repository؟
 *    - يربط البيانات (Database/API) بالـ UseCase أو ViewModel
 *    - يفصل المنطق عن الواجهة (Clean Architecture)
 *
 * 2. ماذا ترجع getAllBooks()؟
 *    - List<Book> = كل الكتب المتوفرة
 *
 * 3. كيفية البحث حسب العنوان؟
 *    - searchBooksByTitle(query: String)
 *
 * 4. Bonus: تصفية الكتب أكثر من 400 صفحة
 * ==========================
 */
class BookRepository {

    // ===== TP1 Exercise 1 & 2: Complete + Add Books =====
    fun getAllBooks(): List<Book> {
        return listOf(
            // Starter Books – Exercise 1
            Book("978-0-13-468599-1", "Clean Code", 464),
            Book("978-0-596-52068-7", "Head First Design Patterns", 694),
            Book("978-0-201-63361-0", "Design Patterns", 395),
            Book("978-1-491-94728-4", "Kotlin in Action", 360),
            Book("978-1-59327-599-0", "Automate the Boring Stuff with Python", 592),

            // Added Books – Exercise 2
            Book("978-0-321-35668-0", "Effective Java", 416),
            Book("978-1-491-92428-5", "Android Programming", 812),
            Book("978-0-13-235088-4", "Clean Architecture", 432),
            Book("978-1-118-96914-3", "Android Development for Beginners", 720),
            Book("978-1491950357", "Designing Data-Intensive Applications", 616)
        )
    }

    // ==========================
    // Bonus Exercise 3: البحث حسب العنوان
    fun searchBooksByTitle(query: String): List<Book> {
        return getAllBooks().filter { it.title.contains(query, ignoreCase = true) }
    }

    // Bonus Exercise 3: الكتب أكثر من 400 صفحة
    fun getLongBooks(): List<Book> {
        return getAllBooks().filter { it.nbPages > 400 }
    }
}