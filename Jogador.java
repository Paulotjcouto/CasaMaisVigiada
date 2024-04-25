public class Jogador {
        private String nomeJogador;
        private int votos;

        public Jogador(String nome) {
            this.nomeJogador = nome;
            this.votos = 0;
        }

        public String getNome() {
            return nomeJogador;
        }

        public int getVotos() {
            return votos;
        }

        public void incrementaUmVoto() {
            this.votos = votos + 1;
        }
    }

