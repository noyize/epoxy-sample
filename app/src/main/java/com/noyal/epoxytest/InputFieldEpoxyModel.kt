package com.noyal.epoxytest

import com.noyal.epoxytest.databinding.ItemInputFieldBinding

data class InputFieldEpoxyModel(val label : String): ViewBindingKotlinModel<ItemInputFieldBinding>(R.layout.item_input_field){
    override fun ItemInputFieldBinding.bind() {
        textInputLayout.hint = label
    }
}
