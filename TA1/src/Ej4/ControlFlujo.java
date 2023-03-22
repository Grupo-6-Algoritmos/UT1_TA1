package Ej4;

public class ControlFlujo {

    /*
    a)La salida va a ser "second string" y "third string".
    b)La salida es "second string" y "third string" porque el if sin corchetes solo
    ejecuta la primera linea de codigo que viene despues, que en este caso es otro if.
    En este caso la condición del segundo if no se cumple y salta al else e imprime
    "second string". Al seguir con la ejecución imprime "third string".
     */
    
    public static void main(String args[]) {
        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");

    }
}
