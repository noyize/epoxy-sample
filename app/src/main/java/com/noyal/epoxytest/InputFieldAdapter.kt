package com.noyal.epoxytest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.noyal.epoxytest.databinding.ItemInputFieldBinding

class InputFieldAdapter : ListAdapter<InputField, RecyclerView.ViewHolder>(InputFieldDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            ItemInputFieldBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InputFieldViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as InputFieldViewHolder).bind(getItem(position))
    }

    inner class InputFieldViewHolder(private val binding: ItemInputFieldBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(inputField: InputField) {
            binding.textInputLayout.hint = inputField.label
        }
    }
}

object InputFieldDiff : DiffUtil.ItemCallback<InputField>() {
    override fun areItemsTheSame(oldItem: InputField, newItem: InputField): Boolean {
        return oldItem.label == newItem.label
    }

    override fun areContentsTheSame(oldItem: InputField, newItem: InputField): Boolean {
        return oldItem == newItem
    }

}