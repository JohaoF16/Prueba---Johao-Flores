
package dominio;

public class Estudiante {
    private String nombre;
    private char genero;
    private double nota;

    public Estudiante(String nombre, char genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return this.nombre+"\t ||\t"+this.genero+"\t || \t"+this.nota;

    }
}
