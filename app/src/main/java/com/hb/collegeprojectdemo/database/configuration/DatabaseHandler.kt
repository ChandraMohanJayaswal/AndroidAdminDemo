package com.hb.collegeprojectdemo.database.configuration


import android.content.Context
import androidx.room.Room
import com.hb.collegeprojectdemo.database.dao.CategoryDao
import com.hb.collegeprojectdemo.database.dao.ProductDao
import com.hb.collegeprojectdemo.database.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseHandler {

    @Singleton
    @Provides
    fun getDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DatabaseConfigs.databaseName
            )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun getUserDao(db: AppDatabase): UserDao {
        return db.userDao()
    }
    @Singleton
    @Provides
    fun getProductDao(db: AppDatabase): ProductDao {
        return db.productDao()
    }
    @Singleton
    @Provides
    fun getCategoryDao(db: AppDatabase): CategoryDao {
        return db.categoryDao()
    }




}

























