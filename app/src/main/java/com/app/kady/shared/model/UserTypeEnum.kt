package com.app.kady.shared.model

enum class UserTypeEnum {
    STORE, CLIENT, DELIVERY;
    fun value ():String{
        return when (this){
            STORE -> "1"
            CLIENT -> "2"
            DELIVERY -> "3"
        }
    }
    fun label():String{
        return when (this){
            STORE -> "Negocio"
            CLIENT -> "Usuario"
            DELIVERY -> "Delivery"
        }
    }
}