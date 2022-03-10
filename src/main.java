import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.lang.String;
import java.time.LocalDate;

public class main {
    //Instanciando, chamando o medodo set
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso js.");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso javaScript");
        curso3.setDescricao("Descrição curso javaScript.");
        curso3.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java.");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Js");
        mentoria2.setDescricao("Descrição mentoria Js.");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria JavaScript");
        mentoria3.setDescricao("Descrição mentoria JavaScript.");
        mentoria3.setData(LocalDate.now());

        /*
        Conteudo conteudo = new Cusos();
        */

        //Imprime o resultado com Shift + F10
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.Proqredir();
        System.out.println("Conteúdos Concluidos de Paulo: " + devPaulo.getConteudosConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.Proqredir();
        System.out.println("Conteúdos Concluidos de Camila: " + devCamila.getConteudosConcluidos());
    }
}
