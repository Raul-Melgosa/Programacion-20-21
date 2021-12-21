/// <reference path="Copia.ts"/>
/// <reference path="Libro.ts"/>
var Lector = /** @class */ (function () {
    function Lector(nombre, telefono, direccion) {
        this.nSocio = Copia.generarId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    Lector.prototype.getNSocio = function () {
        return this.nSocio;
    };
    Lector.prototype.getNombre = function () {
        return this.nombre;
    };
    Lector.prototype.setNombre = function (value) {
        this.nombre = value;
    };
    Lector.prototype.getTelefono = function () {
        return this.telefono;
    };
    Lector.prototype.setTelefono = function (value) {
        this.telefono = value;
    };
    Lector.prototype.getDireccion = function () {
        return this.direccion;
    };
    Lector.prototype.setDireccion = function (value) {
        this.direccion = value;
    };
    /**
     * devolver
id:string, fechaAct: Date     */
    Lector.prototype.devolver = function (id, lista, fechaAct) {
        if (fechaAct === void 0) { fechaAct = new Date(); }
        if (lista.length != 0) {
            var encontrado = false;
            for (var x = 0; x < lista.length; x++) {
                var libro = lista[x];
            }
            return encontrado;
        }
        else {
            return false;
        }
    };
    return Lector;
}());
