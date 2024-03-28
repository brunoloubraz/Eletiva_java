public class aprendeWhile {
    public static void main(String[] args) {
        String[] inscritos = {"Bruno", "Breno", "Michel", "Ana", "Paulo", "Karina", "Lester", "Magic", "Marcelo", "Andre", "Ader"};
        final int numeroVagas = 10;
        String[] vagas = new String[numeroVagas];
        int vagaAtual = 0;
        String inscrito = "Indefinido";
        String log;
        while (vagaAtual < numeroVagas) {
            inscrito = inscritos[vagaAtual];
            log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual += 1;
            System.out.println(log);
        }
    }
}
