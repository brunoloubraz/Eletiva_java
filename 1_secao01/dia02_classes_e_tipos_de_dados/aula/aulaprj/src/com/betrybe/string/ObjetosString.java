package com.betrybe.string;

public class ObjetosString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String frase = "Estamos aprendendo";
        String numeros = "25";
        String nome = "Bruno";

        String fraseCompleta = "Meu nome é " + nome + " e eu tenho " + numeros + " anos";
        System.out.println(fraseCompleta);

        String builder = stringBuilder.append(fraseCompleta)
                .append(nome)
                .append(nome)
                .append(nome)
                .append(nome)
                .toString();

        System.out.println(builder);

    }
}
