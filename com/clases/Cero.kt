package org.example.app.com.clases
//

class Cero {

    var name = "Android TV"
    var speakerVolume = 2
        get() = field
        set(value) {
            field = value
        }

        /*
        * set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        *
        * */

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }

}