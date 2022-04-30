package com.rig.jetpack.qcmapp.data

data class Resource<T, Boolean, E : Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var error: E? = null,
)
