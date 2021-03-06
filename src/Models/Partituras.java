/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author uriigrao
 */
public class Partituras {

    private String codigo;
    private String title;
    private String artista;
    private String instrumento;
    private String genero;
    private String dificultad;
    private boolean impresa;

    public Partituras(String codigo, String title, String artista, String instrumento,
            String genero, String dificultad, boolean impresa) {
        this.codigo = codigo;
        this.title = title;
        this.artista = artista;
        this.instrumento = instrumento;
        this.genero = genero;
        this.dificultad = dificultad;
        this.impresa = impresa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public boolean isImpresa() {
        return impresa;
    }

    public void setImpresa(boolean impresa) {
        this.impresa = impresa;
    }

    @Override
    public String toString() {
        String string = getCodigo() + "," + getTitle() + "," + getArtista() + ","
                    + getInstrumento() + "," + getGenero() + ","
                    + getDificultad();
        
        if (impresa) {
            string += ",true";
        } else {
           string += ",false";
        }
        return string;
    }
}
