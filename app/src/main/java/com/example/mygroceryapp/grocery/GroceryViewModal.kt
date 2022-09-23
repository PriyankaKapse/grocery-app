package com.example.mygroceryapp.grocery

import androidx.lifecycle.ViewModel
import com.example.mygroceryapp.database.GroceryRepository
import com.example.mygroceryapp.database.entity.GroceryEntities
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModal(private val repository: GroceryRepository) : ViewModel() {
    fun insert(items: GroceryEntities) = GlobalScope.launch {
        repository.insert(items)
    }

    fun delete(items: GroceryEntities) = GlobalScope.launch {
        repository.delete(items)
    }

    fun getAllGroceryItems() = repository.getAllItems()
}














