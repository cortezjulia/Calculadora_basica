import java.util.Scanner; // classe para receber variavel do usuário
import java.util.Locale; // usada para o JAVA aceitar o . ou invés da , como separador decimal
public class CalculadoraBasica
{

  public static void main(String[] args)
  {
  Scanner recebe = new Scanner(System.in).useLocale(Locale.US); 
  
  float n1, n2;

  System.out.printf("Informe o primeiro valor: ");
  n1 = recebe.nextFloat(); 

  System.out.printf("Informe o segundo valor: ");
  n2 = recebe.nextFloat(); 

  System.out.printf("\nResultados:\n");
  System.out.printf("%f + %f = %3f\n", n1, n2, (n1 + n2));
  System.out.printf("%f - %f = %3f\n", n1, n2, (n1 - n2));
  System.out.printf("%f * %f = %3f\n", n1, n2, (n1 * n2));
  System.out.printf("%f / %f = %3f\n", n1, n2, (n1 / n2));

  }

}