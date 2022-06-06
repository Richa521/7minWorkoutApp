package com.comp.a7minutesworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Insert
    fun insert(historyEntity: HistoryEntity)

    //Todo 1: create a query to fetch the entries
    @Query("Select * from `history-table`")
    fun fetchALlDates():Flow<List<HistoryEntity>>
}