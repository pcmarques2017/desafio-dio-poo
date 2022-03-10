package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> ConteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();
    private Bootcamp bootcamp;

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void Proqredir(){
        Optional<Conteudo> conteudo = this.getConteudosInscritos().stream().findFirst();
        if(conteudo.isPresent()){
            this.ConteudosConcluidos.add(conteudo.get());
            this.ConteudosInscritos.remove(conteudo.get());
        } else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double Calcularxp(){
        return this.ConteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularxp)
                .sum();
    }

    //Método get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        ConteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(ConteudosInscritos, dev.ConteudosInscritos) && Objects.equals(ConteudosConcluidos, dev.ConteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ConteudosInscritos, ConteudosConcluidos);
    }
}
