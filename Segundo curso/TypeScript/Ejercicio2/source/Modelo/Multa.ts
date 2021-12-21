class Multa {
    private fInicio: Date;
    private fFin: Date;

    constructor(fInicio:Date,fFin:Date) {
        this.fInicio = fInicio;
        this.fFin = fFin;
    }
    
    public getFInicio(): Date {
        return this.fInicio;
    }
    public setFInicio(value: Date) {
        this.fInicio = value;
    }
    
    public getFFin(): Date {
        return this.fFin;
    }
    public setFFin(value: Date) {
        this.fFin = value;
    }
}