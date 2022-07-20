/**
 * Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2.
 * Você precisa comprar um conduite circular
 * (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:
 *https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1589.jpg
 *
 * Qual o menor raio do conduite que você deve comprar?
 * Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?
 *
 * Entrada
 * Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.
 *
 *
 *
 * Na única linha de cada caso teremos dois números inteiros R1 e R2,
 * indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em
 * um inteiro normal de 32 bits.
 * Saída
 * Em cada caso, imprima o menor raio possível em uma única linha
 * -----------------------------------------
 * | Exemplo de Entrada | Exemplo de Saída |
 * -----------------------------------------
 * | 3             2  |
 * | 1 1           10 |
 * | 2 8           0  |
 * | 8 2              |
 * -----------------------------------------
 */

package br.com.dio.testesbasicos;

import java.io.IOException;
import java.util.Scanner;

public class BobConduite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R1, R2, R3;
        for (int i = 0; i < T; i++) {
            R1 = sc.nextInt();
            R2 = sc.nextInt();
            R3 = R1 + R2;
            System.out.println(R3);
        }
    }
}
