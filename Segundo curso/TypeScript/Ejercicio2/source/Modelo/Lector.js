/// <reference path="Copia.ts"/>
/// <reference path="Multa.ts"/>
/// <reference path="Prestamo.ts"/>
var Lector = /** @class */ (function () {
    function Lector(nombre, telefono, direccion) {
        this.nSocio = Copia.generarId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.multa = null;
        this.prestamo = null;
    }
    Lector.prototype.getNSocio = function () {
        return this.nSocio;
    };
    Lector.prototype.getPrestamo = function () {
        return this.prestamo;
    };
    Lector.prototype.setPrestamo = function (value) {
        this.prestamo = value;
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
    Lector.prototype.getMulta = function () {
        return this.multa;
    };
    Lector.prototype.setMulta = function (value) {
        this.multa = value;
    };
    Lector.prototype.gestionMulta = function () {
        if (this.multa != null) {
            if (this.multa.getFFin() < new Date()) {
                this.multa = null;
                return true;
            }
            else if (this.multa.getFFin() > new Date()) {
                return false;
            }
        }
        else {
            return true;
        }
    };
    Lector.prototype.multar = function (dias) {
        var fechaFin = new Date();
        fechaFin.setDate(fechaFin.getDate() + dias);
        this.multa = new Multa(new Date(), fechaFin);
    };
    Lector.prototype.devolver = function (id, lista, fechaAct) {
        if (fechaAct === void 0) { fechaAct = new Date(); }
        if (lista.length != 0) {
            var encontrado = false;
            for (var x = 0; x < lista.length && !encontrado; x++) {
                var libro = lista[x];
                if (libro.getId() == id) {
                    if (this.prestamo.getFin() < new Date()) {
                        this.multar(7);
                    }
                    libro.setEstado(2); //prestado=0,retraso=1,biblioteca=2,reparacion=3
                    encontrado = true;
                }
            }
            return encontrado;
        }
        else {
            return false;
        }
    };
    Lector.prototype.prestar = function (id, fechaAct) {
        if (fechaAct === void 0) { fechaAct = new Date(); }
        if (this.prestamo != null && this.multa == null) {
        }
        else {
            return false;
        }
    };
    return Lector;
}());
