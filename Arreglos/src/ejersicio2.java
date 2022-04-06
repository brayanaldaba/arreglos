import java.util.Scanner;

/**Ejercicio 2
//Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
//teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la
//pantalla.*/
public class Ejersicio2 {
String[] original;
String[] inverso;

Scanner scanner;

public Ejersicio2(){
    original = new String[5];
    inverso = new String[5];

    scanner = new Scanner(System.in);
}
//ejecucion
    public void ejecutar(){
    for (int i = 0;i < original.length; i++){
        System.out.println("original[" +i+"]:");
        String cadena = scanner.nextLine();
        original[i]=cadena;
    }
    int indiceOriginal =0;
    int indiceInverso= 4;
    while (indiceOriginal < original.length ){
        inverso[indiceInverso]=original[indiceOriginal];

        indiceOriginal++;
        indiceInverso--;
    }
    for (int i = 0; i < inverso.length; i++ ){
        System.out.println("inverso["+i+"]:" + inverso[i]);
    }
    }
}
