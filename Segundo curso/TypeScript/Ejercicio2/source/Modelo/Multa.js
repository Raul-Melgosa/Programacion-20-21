var Multa = /** @class */ (function () {
    function Multa(fInicio, fFin) {
        this.fInicio = fInicio;
        this.fFin = fFin;
    }
    Multa.prototype.getFInicio = function () {
        return this.fInicio;
    };
    Multa.prototype.setFInicio = function (value) {
        this.fInicio = value;
    };
    Multa.prototype.getFFin = function () {
        return this.fFin;
    };
    Multa.prototype.setFFin = function (value) {
        this.fFin = value;
    };
    return Multa;
}());
