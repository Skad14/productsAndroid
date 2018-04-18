package com.devmeister.luksinocencio.carrinhodecompras.model

import android.arch.persistence.room.*

@Dao
interface ProductDao {

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(products: Product)

	@Update
	fun update(product: Product)

	@Delete
	fun delete(product: Product)

	@Query("SELECT * FROM products")
	fun getProducts(): List<Product>
}