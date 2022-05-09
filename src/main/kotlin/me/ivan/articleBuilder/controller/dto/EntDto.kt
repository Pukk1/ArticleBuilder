package me.ivan.articleBuilder.controller.dto

import java.io.Serializable

open class EntDto<Id: Serializable>(){
    var id: Id? = null
}