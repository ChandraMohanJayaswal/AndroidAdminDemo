package com.hb.collegeprojectdemo.database.configuration

import com.hb.collegeprojectdemo.database.dao.CategoryDao
import com.hb.collegeprojectdemo.database.dao.CategoryRepository
import com.hb.collegeprojectdemo.database.dao.ProductDao
import com.hb.collegeprojectdemo.database.dao.UserDao
import com.hb.collegeprojectdemo.database.dao.UserRepository
import com.hb.collegeprojectdemo.database.dao.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Singleton
    @Provides
    fun getUserRepository(
         userDao: UserDao,
    ): UserRepository {
        return UserRepository(userDao)
    }


    @Singleton
    @Provides
    fun getCategoryRepository(
        categoryDao: CategoryDao
    ): CategoryRepository {
        return CategoryRepository(categoryDao)
    }

    @Singleton
    @Provides
    fun getProductRepository(
        productDao: ProductDao
    ): ProductRepository {
        return ProductRepository(productDao)
    }
}














