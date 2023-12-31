package com.hb.collegeprojectdemo.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.hb.collegeprojectdemo.database.configuration.DatabaseConfigs
import com.hb.collegeprojectdemo.database.entity.User

@Dao
interface UserDao /*: BaseDao<Image> */ {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<User>)

    @Query("SELECT * FROM " + DatabaseConfigs.tbl_user)
    suspend fun getAllUsers(): List<User>

    @Query("SELECT * FROM " + DatabaseConfigs.tbl_user +  " WHERE userName = :name")
    suspend fun getAdmin(name:String): List<User>

    @Update()
    suspend fun update(user: User)

    @Delete
    suspend  fun delete(user: User)



}

