
package br.com.dio.desafio.dominio;


    //Esses são os atributos
public class Curso extends Conteudo {
        private int cargaHoraria;

        @Override
        public double calcularxp() {
            return XP_PADRAO * cargaHoraria;
        }

        public Curso() {
        }

        //Métodos gets e sets - usando Alt + insert
        public int getCargaHoraria() {
            return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }

        @Override
        public String toString() {
            return "Curso{" +
                    "titulo='" + getTitulo() + '\'' +
                    ", decricao='" + getDescricao() + '\'' +
                    ", cargaHoraria=" + cargaHoraria +
                    '}';
        }


    }
