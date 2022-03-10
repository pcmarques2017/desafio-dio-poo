package br.com.dio.desafio.dominio;
import java.lang.String;
import java.time.LocalDate;
    //Esses são os atributos
public class Mentoria extends Conteudo {

    private LocalDate data;

        @Override
        public double calcularxp() {
            return XP_PADRAO + 20d;
        }

        public Mentoria() {
        }


        //Métodos gets e sets - usando Alt + insert

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    //Imprime o resultado do método
        @Override
        public String toString() {
            return "Mentoria{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", decricao='" + getDescricao() + '\'' +
                    ", data=" + data +
                    '}';
        }
    }
