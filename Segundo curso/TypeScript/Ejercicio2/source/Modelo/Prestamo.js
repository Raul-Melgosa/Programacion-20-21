/// <reference path="Copia.ts"/>
/// <reference path="Lector.ts"/>
var Prestamo = /** @class */ (function () {
    function Prestamo(inicio, fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    Prestamo.prototype.getInicio = function () {
        return this.inicio;
    };
    Prestamo.prototype.setInicio = function (value) {
        this.inicio = value;
    };
    Prestamo.prototype.getFin = function () {
        return this.fin;
    };
    Prestamo.prototype.setFin = function (value) {
        this.fin = value;
    };
    return Prestamo;
}());
