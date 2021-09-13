package com.bridgelabz

class Team {

    String name
    String city
    String logo
    String manager

    static hasMany = [player:Player]

    static constraints = {
        name size: 4..40,blank: false,unique: true
        city size: 4..40,blank: false
        logo size: 4..100,blank: false
        manager size: 4..40,blank: false
    }

    String toString() {
        name
    }
}
