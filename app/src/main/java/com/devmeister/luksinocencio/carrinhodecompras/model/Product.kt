package com.devmeister.luksinocencio.carrinhodecompras.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
		@PrimaryKey(autoGenerate = true) var id: Int = 0,
		@ColumnInfo(name = "prod_image") var image: String = "",
		@ColumnInfo(name = "prod_name") var name: String = "",
		@ColumnInfo(name = "prod_desc") var desc: String = "",
		@ColumnInfo(name = "prod_prices") var prices: Double = 0.0
)