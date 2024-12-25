package com.example.usercatalog

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class UsersViewModel : ViewModel() {

    val mutableUserList = mutableListOf<User?>()
    val users: MutableLiveData<List<User?>> by lazy { MutableLiveData<List<User?>>() }


    init {
        users.value = mutableUserList
    }

}