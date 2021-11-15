package com.christiangalera.guests.service.repository

import com.christiangalera.guests.service.model.GuestModel

class GuestRepository {
    fun getAll():List<GuestModel> {
        var list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresent():List<GuestModel> {
        var list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent():List<GuestModel> {
        var list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun save(guest: GuestModel) {

    }

    fun update(guest: GuestModel){

    }
    fun delete(guest: GuestModel) {

    }


}