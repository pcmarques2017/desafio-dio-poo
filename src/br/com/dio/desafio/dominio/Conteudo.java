
package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    //Método calcular XP
    public abstract double calcularxp();

    //Método get e set
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
}
