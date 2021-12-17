/// <reference path="Autor.ts"/>
var tipoLibro;
(function (tipoLibro) {
    tipoLibro[tipoLibro["novela"] = 0] = "novela";
    tipoLibro[tipoLibro["teatro"] = 1] = "teatro";
    tipoLibro[tipoLibro["poesia"] = 2] = "poesia";
    tipoLibro[tipoLibro["ensayo"] = 3] = "ensayo";
})(tipoLibro || (tipoLibro = {}));
;
var Libro = /** @class */ (function () {
    function Libro(titulo, tipo, editorial, anyo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anyo = anyo;
    }
    return Libro;
}());
