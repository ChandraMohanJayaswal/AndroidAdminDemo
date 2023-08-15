package com.hb.collegeprojectdemo.database.dao

import com.hb.collegeprojectdemo.database.entity.Category
import com.hb.collegeprojectdemo.database.entity.Product
import com.hb.collegeprojectdemo.database.entity.User


class UserRepository constructor(
    private val userDao: UserDao,
){

    suspend fun getAllUsers() = userDao.getAllUsers()
    suspend fun getAdmin(name:String) = userDao.getAdmin(name)

    suspend fun addAdmin(user: User) = userDao.insert(user)



}
