package com.alimmanurung.kotlin_speechtotext.database

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Surah (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "surahName")
    var surahName: String? = null,

    @ColumnInfo(name = "jumlahAyat")
    var jumlahAyat: String? = null,
) : Parcelable