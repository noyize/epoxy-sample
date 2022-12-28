package com.noyal.epoxytest

import com.noyal.epoxytest.databinding.ItemHeaderBinding

data class HeaderEpoxyModel(
    val title : String
) : ViewBindingKotlinModel<ItemHeaderBinding>(R.layout.item_header){
    override fun ItemHeaderBinding.bind() {
        headerTitle.text = title
    }

}
