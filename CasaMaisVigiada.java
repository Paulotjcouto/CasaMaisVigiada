import java.util.ArrayList;
import javax.swing.*;














public class CasaMaisVigiada {


        public static void main(String[] args) {
            ArrayList<Jogador> participantesBBB = new ArrayList<>();

            cadastrarParticipantes(participantesBBB);

            votar(participantesBBB);

            apurarEliminado(participantesBBB);
        }

        private static void cadastrarParticipantes(ArrayList<Jogador> participantes) {
            String[] nomes = {"Alane Dias", "Beatriz Reis", "Davi Brito", "Deniziane Ferreira", "Fernanda Bande",
                    "Giovanna Lima", "Giovanna Pitel", "Isabelle Nogueira", "Juninho", "Leidy Elin", "Lucas Henrique",
                    "Lucas Luigi", "Lucas Pizane", "Marcus Vinicius", "Matteus Amaral", "Maycon Cosmer",
                    "MC Bin Laden", "Michel Nogueira", "Nizam", "Raquele Cardozo", "Rodriguinho", "Thalyta Alves",
                    "Vanessa Lopes", "Vinicius Rodrigues", "Wanessa Camargo", "Yasmin Brunet"};

            for (String nome : nomes) {
                participantes.add(new Jogador(nome));
            }
        }




        private static void votar(ArrayList<Jogador> participantes) {
            String votoEm;

            do {
                votoEm = JOptionPane.showInputDialog("Em quem você vota para sair da casa?");
                if (!votoEm.equalsIgnoreCase("sair")) {
                    contabilizarVoto(participantes, votoEm);
                }
            } while (!votoEm.equalsIgnoreCase("sair"));
        }






        private static void contabilizarVoto(ArrayList<Jogador> participantes, String voto) {
            for (Jogador jogador : participantes) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaUmVoto();
                }
            }
        }

        private static void apurarEliminado(ArrayList<Jogador> participantes) {
            Jogador eliminado = participantes.get(0);
            for (Jogador jogador : participantes) {
                if (jogador.getVotos() > eliminado.getVotos()) {
                    eliminado = jogador;
                }
            }





            JOptionPane.showMessageDialog(null, "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, "
                    + "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, "
                    + "se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou "
                    + "conseguir te eliminar com alegria. Com " + eliminado.getVotos() + " votos, é você quem sai "
                    + eliminado.getNome());
        }
    }

