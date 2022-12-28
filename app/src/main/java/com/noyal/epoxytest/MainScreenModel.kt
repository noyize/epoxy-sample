package com.noyal.epoxytest

data class MainScreenModel(
    val header: Header?,
    val subHeader: SubHeader?,
    val inputFields: List<InputField>?
)

data class Header(val title: String)

data class SubHeader(val title: String)

data class InputField(val label: String)
