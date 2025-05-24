public class Calculadora {

  public static void main(String args[]) {
       //Criando variáveis para inserir os números, converter em double e descobrir o sinal que está sendo utilizado na operação.
       Double numero1 = Double.parseDouble(args[0]);
       String operacao = args[1];
       Double numero2 = Double.parseDouble(args[2]);
       String resultado = "";
       /*Utilizando ternários para descobrir qual operação o usuário está fazendo, assim imprimindo o valor atualizado da variável na tela.
	Caso o contrário, a variável vai continuar vazia até rodar a próxima linha de código e assim sucessivamente.
       */
       resultado = operacao.equals("+") ? "Resultado: " + (numero1 + numero2): resultado;
       resultado = operacao.equals("-") ? "Resultado: " + (numero1 - numero2): resultado;
       resultado = operacao.equals("x") ? "Resultado: " + (numero1 * numero2): resultado;
       resultado = operacao.equals("/") ? "Resultado: " + (numero1 / numero2): resultado;

       System.out.println(resultado);

   }

}