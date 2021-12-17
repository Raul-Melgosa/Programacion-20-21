/// <reference path="Autor.ts"/>

enum tipoLibro{novela,teatro,poesia,ensayo};

class Libro {
    private titulo:string;
    private tipo:tipoLibro;
    private editorial:string;
    private anyo:number;
    private autor:Autor;

    constructor(titulo:string, tipo:tipoLibro, editorial:string, anyo:number) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anyo = anyo;
    }
}