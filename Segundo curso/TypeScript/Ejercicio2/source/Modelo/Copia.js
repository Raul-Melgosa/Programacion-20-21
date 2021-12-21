/// <reference path="Libro.ts"/>
var estadoCopia;
(function (estadoCopia) {
    estadoCopia[estadoCopia["prestado"] = 0] = "prestado";
    estadoCopia[estadoCopia["retraso"] = 1] = "retraso";
    estadoCopia[estadoCopia["biblioteca"] = 2] = "biblioteca";
    estadoCopia[estadoCopia["reparacion"] = 3] = "reparacion";
})(estadoCopia || (estadoCopia = {}));
;
var Copia = /** @class */ (function () {
    function Copia(estado, libro) {
        this.id = Copia.generarId();
        this.estado = estado;
        this.libro = libro;
    }
    Copia.generarId = function () {
        return new Date().valueOf() + "";
    };
    Copia.prototype.getId = function () {
        return this.id;
    };
    Copia.prototype.getEstado = function () {
        return this.estado;
    };
    Copia.prototype.setEstado = function (value) {
        this.estado = value;
    };
    Copia.prototype.getLibro = function () {
        return this.libro;
    };
    Copia.prototype.setLibro = function (value) {
        this.libro = value;
    };
    return Copia;
}());
