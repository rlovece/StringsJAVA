import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int opcion;
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                    ejemplo1();
                    break;

                case 2:
                    ejemplo2();
                    break;

                case 3:
                    ejemplo3();
                    break;

                case 4:
                    ejemplo4();
                    break;

                case 5:
                    ejemplo5();
                    break;

                case 0:
                    Consola.escribir("Gracias por su visita 👋");
                    break;
                default:
                    Consola.escribir("Opción incorrecta!");
            }
        } while (opcion!=0);
        Consola.leerString("Precione ENTER tecla para continuar....");

    }

    public static int menu (){

        Consola.escribir("1. Determinar si es palíndromo");
        Consola.escribir("2. Cuantas veces aparece una cadena");
        Consola.escribir("3. Convertir frase a camelCase");
        Consola.escribir("4. Eliminar vocales");
        Consola.escribir("5. Convertir cadena a snake_case");
        Consola.escribir("Elige una opción 👆 o 0 para salir!");
        int opcion = Consola.leerInt("Qué opción? 😁\n");
        return opcion;
    }

    ///region Ejemplo1 - Determinar si es palíndromo
    /*  Palindromo significa que se lee igual de izquierda a derecha que de derecha
        a izquierda).*/
    public static void ejemplo1 (){
        String cadena = Consola.leerString("Ingrese una cadena");
        boolean rta = true;
        for (int i=0; i< cadena.length() && rta; i++){
            if (cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)){
                rta = false;
            }
        }
        if (rta) {
            Consola.escribir("La cadena es palíndromo");
        } else {

            Consola.escribir("La cadena NO es palíndromo");
        }
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion

    ///region Ejemplo2 - Determinar cuantas veces aparece una cadena en otra, ambas ingresadas.
    public static void ejemplo2 (){
        String cadenaAEvaluar = Consola.leerString("Ingrese la cadena a evaluar (no se contemplran mayusculas)");
        String cadenaBuscada = Consola.leerString("Ingrese la cadena a buscar");

        cadenaAEvaluar = cadenaAEvaluar.toLowerCase(); /// Paso las cadena a minuscula
        cadenaBuscada = cadenaBuscada.toLowerCase();

        int cant1 = cadenaAEvaluar.length();
        int cant2 = cadenaBuscada.length();

        String auxCadena = cadenaAEvaluar.replace(cadenaBuscada, "");

        int rta = (cant1 - auxCadena.length())/cant2;

        Consola.escribir("La cadena buscada aparece " + rta + " veces");
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion

    ///region Ejemplo3 - Convertir frase a camelCase
    public static void ejemplo3 (){
        String cadena = Consola.leerString("Ingrese una cadena");
        String[] auxArreglo = cadena.split(" ");
        String rta = "";
        for (int i=0; i<auxArreglo.length; i++){
            rta = rta + auxArreglo[i].substring(0,1).toUpperCase() +
                    auxArreglo[i].substring(1,auxArreglo[i].length());
        }
        Consola.escribir("Su cadena en camelCase: " + rta);
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion

    ///region Ejemplo4 - Eliminar vocales
    public static void ejemplo4 (){
        String cadena = Consola.leerString("Ingrese una cadena");
        String rta;
        rta = cadena.replace("a", "");
        rta = rta.replace("e", "");
        rta = rta.replace("i", "");
        rta = rta.replace("o", "");
        rta = rta.replace("u", "");
        Consola.escribir("Su cadena sin vocales: " + rta);
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion

    ///region Ejemplo5 - Convertir cadena a snake_case
    public static void ejemplo5 (){
        String cadena = Consola.leerString("Ingrese una cadena");
        cadena = cadena.toLowerCase();
        String rta;
        rta = cadena.replace(" ", "_");
        Consola.escribir("Su cadena sin vocales: " + rta);
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion
}