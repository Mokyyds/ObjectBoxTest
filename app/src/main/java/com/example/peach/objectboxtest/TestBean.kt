package com.example.peach.objectboxtest

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by Peach on 2017/11/8.
 */
@Entity
data class TestBean(@Id val id:Int) {
    override fun toString(): String {
        return "TestBean(id=$id)"
    }
}