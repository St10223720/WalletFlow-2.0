package com.example.prog7313ui.data.dao

import androidx.room.*
import com.example.prog7313ui.data.entity.BudgetCategory
import kotlinx.coroutines.flow.Flow

/**
 * DAO for interacting with the BudgetCategory table in the database.
 */
@Dao
interface BudgetCategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: BudgetCategory)

    @Update
    suspend fun updateCategory(category: BudgetCategory)

    @Delete
    suspend fun deleteCategory(category: BudgetCategory)

    // Retrieves all budget categories available to the user.
    @Query("SELECT * FROM budget_categories")
    fun getAllCategories(): Flow<List<BudgetCategory>>
}
