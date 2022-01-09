package com.gdsc.laundropool.datasource.db.pastPools

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "past_pools")
data class PastPoolsEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "pool_id")
    val poolId : Int

)