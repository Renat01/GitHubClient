package com.github.client.common.utils

fun getScreenState(list: List<Any>) =
    if (list.isNotEmpty())
        ScreenState.RESULT_OK
    else
        ScreenState.EMPTY

