package AulasJava.Introducao;

public class aula13EstruturaDeRepeticaoExercicio {
    public static void main(String[] args) {
        double carro = 40000;
        for (int parcela = 1; parcela <=carro ; parcela++) {
            double valorCarro = carro / parcela;
            if (valorCarro < 1000){
                break;
            }
            System.out.println("parcela "+parcela +"R$ "+valorCarro);

        }
    }
}
