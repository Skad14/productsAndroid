package com.devmeister.luksinocencio.carrinhodecompras.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.devmeister.luksinocencio.carrinhodecompras.model.ProductDao
import com.devmeister.luksinocencio.carrinhodecompras.model.Product

@Database(entities = [(Product::class)], version = 1)
abstract class ProductDatabase : RoomDatabase() {

	abstract fun productDao(): ProductDao
}