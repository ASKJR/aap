
/*
* Aluno: Alberto Sussumu Kato Junior
* 

/*
* ENUNCIADO:
* Faça uma versão clean code do arquivo anexo. 
* O arquivo anexado é um exemplo de código Bubble Sort. 
* Faça ao menos 3 alterações no arquivo para ser mais "clean code" e 
* explique quais alterações você fez. 
* Caso você não queira utilizar este código pode escolher outro 
* em Sorting Algorithms - GeeksforGeeks
*/

/*
 * MODIFICAÇÕES:
 * 1) Minimizar Parâmetros: Remoção do parâmetro tamanho de array (n) para os
 * métodos: bubbleSort e printArray.
 * 
 * 2) Nomes Significativos: 
 *  arr -> numerosParaOrdenar, 
 *  arr -> numerosParaImprimir,
 *  bubbleSort -> ordenaNumerosComBubbleSort,
 *  printArray -> imprimeNumerosNoConsole 
 *  etc.
 * 
 * 3) Comentários: Remoção de comentários por nomes significativos. Ex.
 *  // Function to print an array -> imprimeNumerosNoConsole()
 *  
 * 4) YAGNI: Remoção do import java.io.*; Substituição de `for` tradicional por
 * `for` avançado em imprimeNumerosNoConsole.
 * 
 * 5) Variáveis declaradas próximas ao seu contexto de uso. Ex. int i declarado
 * dentro do `for`.
 * 
 * 6) Métodos: Criação da função trocaValoresDePosicaoNoArray para facilitar a 
 * legibilidade.
 * 
 */

public class BubbleSort {

  public static void ordenaNumerosComBubbleSort(int numerosParaOrdenar[]) {
    int totalNumeros = numerosParaOrdenar.length;
    boolean trocado;
    for (int i = 0; i < totalNumeros - 1; i++) {
      trocado = false;
      for (int j = 0; j < totalNumeros - i - 1; j++) {
        int posicaoNumberoA = j, posicaoNumberoB = j + 1;
        if (numerosParaOrdenar[posicaoNumberoA] > numerosParaOrdenar[posicaoNumberoB]) {
          trocaValoresDePosicaoNoArray(posicaoNumberoA, posicaoNumberoB, numerosParaOrdenar);
          trocado = true;
        }
      }
      if (!trocado)
        break;
    }
  }

  public static void imprimeNumerosNoConsole(int numerosParaImprimir[]) {
    for (int numero : numerosParaImprimir)
      System.out.print(numero + " ");
    System.out.println();
  }

  public static void main(String args[]) {
    int numeros[] = { 64, 34, 25, 12, 22, 11, 90 };
    ordenaNumerosComBubbleSort(numeros);
    System.out.println("Array ordenado: ");
    imprimeNumerosNoConsole(numeros);
  }

  private static void trocaValoresDePosicaoNoArray(int posicaoA, int posicaoB, int[] numeros) {
    int valorA = numeros[posicaoA], valorB = numeros[posicaoB];
    numeros[posicaoA] = valorB;
    numeros[posicaoB] = valorA;
  }
}