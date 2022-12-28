package com.noyal.epoxytest

import com.airbnb.epoxy.EpoxyController

class MainScreenController(private val mainScreenModel: MainScreenModel) : EpoxyController() {

    override fun buildModels() {
        mainScreenModel.header?.let {
            HeaderEpoxyModel(it.title)
                .id("header")
                .addTo(this)
        }
        mainScreenModel.subHeader?.let {
            SubHeaderEpoxyModel(it.title)
                .id("sub_header")
                .addTo(this)
        }
        mainScreenModel.inputFields?.let {
            InputGroupEpoxyModel(it)
                .id("input_Field_group")
                .addTo(this)
        }
    }
}