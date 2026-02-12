package domain;

import java.time.LocalDate;

<<<<<<< HEAD
public class Mentoria extends Conteudo {


    private LocalDate date;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

=======
public class Mentoria {

    private String titulo;
    private  String descricao;
    private LocalDate date;

    public  Mentoria(){

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
>>>>>>> origin/main

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
<<<<<<< HEAD
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
=======
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
>>>>>>> origin/main
                ", date=" + date +
                '}';
    }
}
<<<<<<< HEAD

=======
>>>>>>> origin/main
