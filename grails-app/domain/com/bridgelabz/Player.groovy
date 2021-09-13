package com.bridgelabz

class Player {

    static belongsTo = [team:Team]
    String name
    Integer age;
    String profile

    static constraints = {
        name size: 4..40,unique: true,blank: false
        age min:17, max: 51,blank:false
        profile size: 4..40, blank: false
    }

    String toString() {
        name
    }
}
