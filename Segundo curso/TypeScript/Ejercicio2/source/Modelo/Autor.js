/// <reference path="Libro.ts"/>
var Autor = /** @class */ (function () {
    function Autor(nombre, nacionalidad, fechaNacimiento, librosEscritos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        if (librosEscritos == null) {
            this.librosEscritos = new Array();
        }
        else {
            this.librosEscritos = librosEscritos;
        }
    }
    return Autor;
}());
