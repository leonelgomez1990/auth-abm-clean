package com.leo.abm.CoreFeature.utils

sealed class MyResult<out R> {
    data class Success<out T>(val data: T): MyResult<T>()
    data class Failure(val exception: Exception): MyResult<Nothing>()
}
