package com.hb.collegeprojectdemo.database.dao

import com.hb.collegeprojectdemo.database.entity.Category
import com.hb.collegeprojectdemo.database.entity.Product
import com.hb.collegeprojectdemo.database.entity.User

class CategoryRepository constructor(
    private val categoryDao: CategoryDao,
){
    suspend fun getAllCategory() = categoryDao.getAllCategories()

    suspend fun addCategory(addThis: List<Category>) : List<Long>{
        return  categoryDao.insertMany(addThis)
    }

    suspend fun addCategoryFromUser(addThis: Category) : Long{
        return  categoryDao.insert(addThis)
    }

    suspend fun deleteCategory(category: Category) = categoryDao.delete(category)
}
