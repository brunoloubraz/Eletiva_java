public class aprendeFor {
    public static void main(String[] args){
        String[] alunos = {"Bruno", "Karina", "Marcio", "Alberto"};
        int numero;
        String log;
        int totalAlunos = alunos.length;
        int matricula;
        for (numero = 1; numero <= 2; numero += 1) {
            log = "O numero atual é " + numero + "\n";
            System.out.println(log);
        }
        for (int posicao = 0; posicao < totalAlunos; posicao++){
            matricula = posicao + 1;
            log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
            System.out.println(log);
        }
    }
}
