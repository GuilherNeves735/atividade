import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8]; // Array para armazenar as 8 notas
        
        // Recebendo as notas do aluno
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        // Calculando médias bimestrais (2 notas por bimestre)
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i*2] + notas[i*2 + 1]) / 2;
        }
        
        // Calculando médias semestrais (2 bimestres por semestre)
        double[] mediasSemestrais = new double[2];
        for (int i = 0; i < 2; i++) {
            mediasSemestrais[i] = (mediasBimestrais[i*2] + mediasBimestrais[i*2 + 1]) / 2;
        }
        
        // Calculando média final
        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;
        
        // Exibindo resultados
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < 4; i++) {
            System.out.println("Média do Bimestre " + (i + 1) + ": " + mediasBimestrais[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Média do Semestre " + (i + 1) + ": " + mediasSemestrais[i]);
        }
        System.out.println("Média Final: " + mediaFinal);
        
        sc.close();
    }
}
