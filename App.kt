package org.example.app

import org.example.app.com.clases.SmartDevice
import org.example.app.com.clases.SmartHome
import org.example.app.com.clases.SmartLightDevice
import org.example.app.com.clases.SmartTvDevice
import org.example.utils.Printer

// This is the main entry point of the application.
// It uses the `Printer` class from the `:utils` subproject.
fun main() {
//    val message = "Hello JetBrains!"
//    val printer = Printer(message)
//    printer.printMessage()
//
    var smartDevice : SmartDevice = SmartTvDevice("Android TV", "Entertainment")

    smartDevice = SmartLightDevice("Google Light", "Utility")

    // A continuación temos a clase SmartHome asignada a variable que é de tipo SmartDevice -> ERROR
    //smartDevice = SmartHome(SmartTvDevice("Android TV", "Entertainment"),SmartLightDevice("Google Light", "Utility"))
}
