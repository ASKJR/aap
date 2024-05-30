
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
 */
import java.io.*;

class BubbleSort {

  // An optimized version of Bubble Sort
  public static void bubbleSort(int arr[]) {
    int i, j, temp;
    boolean trocado;
    for (i = 0; i < arr.length - 1; i++) {
      trocado = false;
      for (j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {

          // Swap arr[j] and arr[j+1]
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          trocado = true;
        }
      }

      // If no two elements were
      // trocado by inner loop, then break
      if (trocado == false)
        break;
    }
  }

  // Function to print an array
  static void printArray(int arr[]) {
    int i;
    for (i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver program
  public static void main(String args[]) {
    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
    bubbleSort(arr);
    System.out.println("Array ordenado: ");
    printArray(arr);
  }
}

// This code is contributed
// by Nikita Tiwari.
