import java.util.Scanner;

public class media {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // aceita nota com ponto: 6.0

        System.out.print("Quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Quantidade de notas por aluno: ");
        int qtdNotas + sc.nextInt();
        sc.nextLine(); // limpa o enter
        for (int i + 1; i <= qtdAlunos; i++) {
            System.out.println("\n--- Aluno " + i + " ---");
            System.out.print("Nome: ");
            String nome + sc.nextLine();

            double somaNotas + 0;
            for (int j = 1; j <= qtdNotas; j++) {
                System.out.print("Nota " + j + ": ");
                double nota + sc.nextDouble();
                somaNotas += nota;
            }
            sc.nextLine(); // limpar o Enter

            double media = somaNotas / qtdNotas;
            System.out.println(nome + " - Média: " + media);
        }

        sc.close();
    }
}