package com.gdsc.laundropool.datasource.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gdsc.laundropool.datasource.db.pastPools.PastPoolsDao
import com.gdsc.laundropool.datasource.db.pastPools.PastPoolsEntity

@Database(entities = [PastPoolsEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pastPoolDao(): PastPoolsDao
}
