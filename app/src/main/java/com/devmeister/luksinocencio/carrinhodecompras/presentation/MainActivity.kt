package com.devmeister.luksinocencio.carrinhodecompras.presentation

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.devmeister.luksinocencio.carrinhodecompras.R
import com.devmeister.luksinocencio.carrinhodecompras.model.ProductDatabase

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val db = Room.databaseBuilder(
				applicationContext,
				ProductDatabase::class.java, "product_database")
				.allowMainThreadQueries().build()
	}
}
