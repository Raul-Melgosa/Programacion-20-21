/// <reference path="Libro.ts"/>

enum estadoCopia{prestado=0,retraso=1,biblioteca=2,reparacion=3};

class Copia {
    private id:string;
    private estado: estadoCopia;
    private libro: Libro;
    
    public static generarId(): string {
        return new Date().valueOf()+"";
    }

    constructor(estado: estadoCopia, libro: Libro) {
        this.id = Copia.generarId();
        this.estado = estado;
        this.libro = libro;
    }

    public getId(): string {
        return this.id;
    }
    
    public getEstado(): estadoCopia {
        return this.estado;
    }

    public setEstado(value: estadoCopia) {
        this.estado = value;
    }
    
    public getLibro(): Libro {
        return this.libro;
    }

    public setLibro(value: Libro) {
        this.libro = value;
    }
}