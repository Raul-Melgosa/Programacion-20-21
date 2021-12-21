/// <reference path="Copia.ts"/>
/// <reference path="Lector.ts"/>

class Prestamo {
    private inicio: Date;
    private fin: Date;
    constructor(inicio:Date,fin:Date) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public getInicio(): Date {
        return this.inicio;
    }
    public setInicio(value: Date) {
        this.inicio = value;
    }

    public getFin(): Date {
        return this.fin;
    }
    public setFin(value: Date) {
        this.fin = value;
    }
}