package com.hb.collegeprojectdemo.database.configuration

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hb.collegeprojectdemo.database.dao.CategoryDao
import com.hb.collegeprojectdemo.database.dao.ProductDao
import com.hb.collegeprojectdemo.database.dao.UserDao
import com.hb.collegeprojectdemo.database.entity.Category
import com.hb.collegeprojectdemo.database.entity.User
import com.hb.collegeprojectdemo.database.entity.Product



@Database(entities = [Product::class, Category::class, User::class], version = DatabaseConfigs.databaseVersion,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
    abstract fun categoryDao(): CategoryDao
    abstract fun userDao(): UserDao
}