package org.example.clases

class Persoa {
    var nombre: String = "Desconocido"
        get() = field  // `field` representa el valor real de la propiedad
        set(value) {
            field = value.uppercase() // Se guarda en mayúsculas
        }
}