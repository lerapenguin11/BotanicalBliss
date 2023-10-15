package com.example.botanicalbliss.presentation.listener

import android.provider.ContactsContract.Contacts.Photo

interface PhotoListener {

    fun getPhotoListener(photo : com.example.domain.entities.Photo)
}