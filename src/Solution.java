

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// Esborra subcadena:

/*  Donades dues cadenes, comprova si la segona és subcadena de la primera i si és així, crea una tercera cadena igual a la primera sense l'aparició de la segona. Si apareix més d'un cop, només es suprimirà la primera aparició. Si no hi apareix s'imprimeix la primera cadena com estava originàriament.

Input Format

Introdueix les dues cadenes fins a final de línia.

Constraints

No n'hi ha.

Output Format

Imprimeix la primera cadena sense la primera ocurrència de la 2na cadena en ella.

Sample Input 0

Es pot observar com els estudiants que treballen aproven dam.
 que treballen
Sample Output 0

Es pot observar com els estudiants aproven dam.
Sample Input 1

dam dam dam dam
dam
Sample Output 1

dam dam dam
Sample Input 2

si no apareix no cal treure res
poblenou
Sample Output 2

si no apareix no cal treure res

 */


public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String palabra = sc.nextLine();
        System.out.println(frase.replaceFirst(palabra, ""));

    }

}
