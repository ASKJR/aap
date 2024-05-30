
/*
* UFPR – Universidade Federal do Paraná
* Setor de Educação Profissional e Tecnológica
* Especialização em Desenvolvimento Agil de Software
* AAP - Aspectos Ageis de Programação
*
* Prof. Ms. Daniel Francisco Wandarti
* Aluno: Alberto Sussumu Kato Junior
*/

/*
* Trabalho da Disciplina - AAP
*
* ENUNCIADO:
* Faça uma versão clean code do arquivo anexo. 
* O arquivo anexado é um exemplo de código Bubble Sort. 
* Faça ao menos 3 alterações no arquivo para ser mais "clean code" e 
* explique quais alterações você fez. 
* Caso você não queira utilizar este código pode escolher outro 
* em Sorting Algorithms - GeeksforGeeks
*
*/

/*
 * MODIFICAÇÕES REALIZADAS PELO ALUNO:
 * 
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
 *  // Function to print an array -> `imprimeNumerosNoConsole`
 *  
 * 4) YAGNI: Remoção do import java.io.*; Substituição do `for` tradicional por
 * `for` avançado em `imprimeNumerosNoConsole`.
 * 
 * 5) Variáveis declaradas próximas ao seu contexto de uso. Ex. int i declarado
 * dentro do `for`.
 * 
 * 6) Métodos: Criação do método `trocaValoresDePosicaoNoArray` para facilitar a 
 * legibilidade e encapsulamento da lógica de troca.
 * 
 * 7) Organização da Classe : Métodos públicos primeiros e nas sequência os privados.
 * 
 */

public class BubbleSort {

  public static void ordenaNumerosComBubbleSort(int numerosParaOrdenar[]) {
    int totalNumeros = numerosParaOrdenar.length;
    boolean trocado;
    for (int i = 0; i < totalNumeros - 1; i++) {
      trocado = false;
      for (int j = 0; j < totalNumeros - i - 1; j++) {
        int posicaoNumeroA = j, posicaoNumeroB = j + 1;
        if (numerosParaOrdenar[posicaoNumeroA] > numerosParaOrdenar[posicaoNumeroB]) {
          trocaValoresDePosicaoNoArray(posicaoNumeroA, posicaoNumeroB, numerosParaOrdenar);
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

  private static void trocaValoresDePosicaoNoArray(int posicaoNumeroA, int posicaoNumeroB, int[] numeros) {
    int valorNumeroA = numeros[posicaoNumeroA], valorNumeroB = numeros[posicaoNumeroB];
    numeros[posicaoNumeroA] = valorNumeroB;
    numeros[posicaoNumeroB] = valorNumeroA;
  }
}