package com.example.prog7313ui.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Represents a category under which expenses can be grouped.
 *
 * Examples include categories like 'Food', 'Transport', or 'Utilities'.
 * Users can use this to track how much they spend in each category.
 */
@Entity(tableName = "budget_categories")
data class BudgetCategory(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0, // Unique identifier for each category
    val name: String // Name of the category
)
