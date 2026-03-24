package Exercise_01;
import java.util.*;
public class AppConcurso {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite a Nota da Redação: ");
    double notaDaRedacao = input.nextDouble();
    System.out.println("\nDigite a quantidade de questões acertadas: ");
    int questoesAcertadas = input.nextInt();
    try{
      SituacaoCandidato sc = new SituacaoCandidato(notaDaRedacao, questoesAcertadas);
      String situacao = sc.definirSituacao(notaDaRedacao, questoesAcertadas);
      System.out.println("---Classificação do candidato---\n");
      System.out.printf("Nota da Redação: %.2f", sc.getNotaDaRedacao());
      System.out.println("\nQuantidade de questões acertadas: " + sc.getQuestoesAcertadas());
      System.out.println("Situação do Candidato: " + situacao);
    }
    catch(IllegalArgumentException e){System.out.println(e.getMessage());}
    input.close();
  }
}
