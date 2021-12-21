/// <reference path="Libro.ts"/>


class Autor {
    private nombre:string;
    private nacionalidad:string;
    private fechaNacimiento:Date;

    private librosEscritos:Libro[];

    constructor(nombre:string,nacionalidad:string,fechaNacimiento:Date, librosEscritos?:Libro[]) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        
        
        if(librosEscritos==null) {
            this.librosEscritos = new Array();
        } else {
            this.librosEscritos = librosEscritos;
        }
    }
}