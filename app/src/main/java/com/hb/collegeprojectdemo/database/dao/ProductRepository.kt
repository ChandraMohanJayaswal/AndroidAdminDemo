package com.hb.collegeprojectdemo.database.dao

import com.hb.collegeprojectdemo.database.entity.Category
import com.hb.collegeprojectdemo.database.entity.Product
import com.hb.collegeprojectdemo.database.entity.User

class ProductRepository  constructor(
    private val productDao: ProductDao
){
    suspend fun getAllProducts(id:Int) = productDao.getAllProducts(id)
    suspend fun addProduct(addThis: List<Product>) : List<Long>{
        return  productDao.insertMany(addThis)
    }
}
