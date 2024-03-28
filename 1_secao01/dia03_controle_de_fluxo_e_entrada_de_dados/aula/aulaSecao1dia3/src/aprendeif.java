import java.util.Random;

public class aprendeif {
    public static void main(String[] args){
        int mediaFinal = resultado();
        String resultado = "Indefinido";

        if (mediaFinal >= 7) {
            resultado = "aprovada";
        } else if (mediaFinal >= 6) {
            resultado = "Realizar prova bonus";
        } else {
            resultado = "Reprovado";
        }
        System.out.println(resultado);
    }
    static int resultado() {
        return new Random().ints(0,11).findFirst().getAsInt();
    }
}
