package com.hb.collegeprojectdemo.database.dao

import com.hb.collegeprojectdemo.database.entity.Category
import com.hb.collegeprojectdemo.database.entity.Product
import com.hb.collegeprojectdemo.database.entity.User


class UserRepository constructor(
    private val productDao: ProductDao,
    private val categoryDao: CategoryDao,
    private val userDao: UserDao,
){

    suspend fun getAllUsers() = userDao.getAllUsers()
    suspend fun getAdmin(name:String) = userDao.getAdmin(name)

    suspend fun addAdmin(user: User) = userDao.insert(user)
    suspend fun getAllCategory() = categoryDao.getAllCategories()
    suspend fun getAllProducts(id:Int) = productDao.getAllProducts(id)
    suspend fun addCategory(addThis: List<Category>) : List<Long>{
       return  categoryDao.insertMany(addThis)
    }

    suspend fun addProduct(addThis: List<Product>) : List<Long>{
        return  productDao.insertMany(addThis)
    }


    suspend fun addCategoryFromUser(addThis: Category) : Long{
        return  categoryDao.insert(addThis)
    }

    suspend fun deleteCategory(category: Category) = categoryDao.delete(category)




}
