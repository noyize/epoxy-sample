package com.noyal.epoxytest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.noyal.epoxytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainScreenModel = getMainScreeData()
        val mainScreenController = MainScreenController(mainScreenModel)
        binding.epoxyRecyclerView.setController(mainScreenController)
        mainScreenController.requestModelBuild()
    }

    private fun getMainScreeData() = MainScreenModel(
        header = Header(title = "A Sample Header"),
        subHeader = SubHeader(title= "Sub Header"),
        inputFields = listOf(
            InputField(label = "Male"),
            InputField(label = "Female"),
            InputField(label = "Transgender"),
        )
    )
}