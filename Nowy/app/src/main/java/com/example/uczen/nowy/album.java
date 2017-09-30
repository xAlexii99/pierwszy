package com.example.uczen.nowy;

/**
 * Created by uczen on 2017-09-30.
 */

public class album  {
    private String Tytuł;
    private String Autor;
    private String Data_wydania;
    private int idOkladki;

    public album(String Tytuł,String Data_wydania,String Autor,int idOkladki){
        this.setTytuł(Tytuł);
        this.setData_wydania(Data_wydania);
        this.setAutor(Autor);
        this.setIdOkladki(idOkladki);
    }

    public String getTytuł() {
        return Tytuł;
    }

    public void setTytuł(String tytuł) {
        Tytuł = tytuł;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getData_wydania() {
        return Data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        Data_wydania = data_wydania;
    }

    public int getIdOkladki() {
        return idOkladki;
    }

    public void setIdOkladki(int idOkladki) {
        this.idOkladki = idOkladki;
    }
}
