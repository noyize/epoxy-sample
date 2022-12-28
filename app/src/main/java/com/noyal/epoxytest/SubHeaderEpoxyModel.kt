package com.noyal.epoxytest

import com.noyal.epoxytest.databinding.ItemSubHeaderBinding

class SubHeaderEpoxyModel(
    private val title : String
): ViewBindingKotlinModel<ItemSubHeaderBinding>(R.layout.item_sub_header){
    override fun ItemSubHeaderBinding.bind() {
        subHeaderTitle.text = title
    }

}