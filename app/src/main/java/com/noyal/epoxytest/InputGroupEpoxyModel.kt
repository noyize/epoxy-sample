package com.noyal.epoxytest

import com.noyal.epoxytest.databinding.ItemInputGroupBinding

data class InputGroupEpoxyModel(
    val inputFields : List<InputField>
): ViewBindingKotlinModel<ItemInputGroupBinding>(R.layout.item_input_group){
    override fun ItemInputGroupBinding.bind() {
        val inputFieldAdapter  = InputFieldAdapter()
        inputFieldRecyclerView.adapter = inputFieldAdapter
        inputFieldAdapter.submitList(inputFields)
    }

}