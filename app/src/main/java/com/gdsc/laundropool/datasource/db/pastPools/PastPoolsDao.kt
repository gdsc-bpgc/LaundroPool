package com.gdsc.laundropool.datasource.db.pastPools

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface PastPoolsDao {
    @Query("SELECT * FROM past_pools WHERE pool_id = :poolID")
    suspend fun searchByID(poolID: Int): PastPoolsEntity

    // TODO replace is probably not the best way to go about this.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pool: PastPoolsEntity)

    @Query("SELECT* FROM past_pools")
    suspend fun getAllPastPools(): PastPoolsEntity
}
