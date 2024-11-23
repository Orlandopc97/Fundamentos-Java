import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Este comentario
        tiene varias lineas

        Lo de adrento de una llaves es el SCOPE = ALCANCE
        {
           SCOPE (CODIGO)
        }
        */

        // Imprimir hola mundo
        //Esto es un comentario de una linea
        System.out.println("SALUDOS PARA EL MUNDO DE JAVA" );


        /*
            Variable:
                Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
            Declaracion:
                Asignar un tipo de dato y el nombre de la variable sin darle un  valor inicial
            Definicion:
                Asignar el tipo de dato y el nombre de la variable dandole o no unvalor inicial
            Asignacion:
                Darle un valor a la variable ya declarada
         */

        /*
        TIPOS DE VARIABLES
            VARIABLES PRIMITIVAS : Almacenan valores basicos
            VARIABLES DE REFERENCIA: Almacena direcciones de memoria que apuntan a objetos

         */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //TIPOS DE DATOS ENTEROS: BYTE, SHORT, INT, LONG
        int numero = 5;

        //TIPOS DE DATOS REALES(DECIMALES)
        double decimales = 5.98547374553322;
        float decimos = 5.94894748456654f;//solo imprime 7 decimales

        //TIPO DE DATO DE CARACTER
        char letra = 's';

        //TIPO DE DATO BOOLEANO
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(numero);
        System.out.println(decimales);
        System.out.println(decimos);
        System.out.println(letra);
        System.out.println(verdadero);
        System.out.println(falso);

        String cadena = "Esto es una cadena o string";
        System.out.println(cadena);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Mas de la variable string
        String texto = "   Este es un texto asignado a la variable String     ";
        // Este es el largo de la cadena da texto
        int longitud = texto.length();
        System.out.println(texto + " " + longitud);
        //Seleccionar el caracter en la posicion que se elija 0 hasta el largo
        char caracter = texto.charAt(8);
        System.out.println(caracter);
        //Substraer una parte o cadena de una cadena mas grande
        String subCadena = texto.substring(5,16);
        System.out.println(subCadena);
        //volver la cadena de texto a minusculas
        String minusculas = texto.toLowerCase();
        System.out.println(minusculas);
        //VOLVER LA CADENA DE TEXTO A MAYUSCULAS
        String mayusculas = texto.toUpperCase();
        System.out.println(mayusculas);
        //Buscar cual es el indice de algo
        int indice = texto.indexOf("variable");
        System.out.println(indice);
        //Remplazar una palabra en la cadena
        String reemplazado = texto.replace("texto","parrafo");
        System.out.println(reemplazado);
        //Si la cadena contiene la palabra asignado
        boolean contiene = texto.contains("palabra");
        System.out.println("¿Tiene la palabra 'asigando'? " + contiene);
        //quitar espacios al principio y final de la cadena de texto
        String sinEspacios = texto.trim();
        System.out.println(sinEspacios);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        OPERADORES: Son simbolos que sirven para hacer operaciones con variables o valores

         */
        //Aritmeticos: +, -, *, /, %
        double a = 20.7;
        double b = 5.4;
        double suma = a+b;
        System.out.println(suma);
        //residuo de una division
        double c = a % 2;
        System.out.println(c);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADORES DE ASIGNACION
        //se queda con el ultimo valor asignado
        c = 50;
        //se le suma el segundo valor 15
        c += 15;
        //se le suma untercer valor
        c +=25;
        //se le resta el valor
        c -= 30;
        //se multiplica por el valor
        c *= 2;
        //se divide entre el valor
        c /= 4;
        //c ++ es sumarle uno incrememto ++ decremeto --
        c ++;
        System.out.println(c);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADORES DE COMPARACION
        //mayor o menor
        a = 10;
        b = 15;

        boolean esMayor = a > b;
        boolean esMenor = a < b;
        boolean esIgual = a == b;
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //OPERADORES DE LOGICA

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; //ambos deben ser true para que den true
        boolean resultadoOR = condicion1 || condicion2; // si alguno de los dos es true dara true
        boolean resultadoNOT = !condicion1; //lo contrario a lo que tenga asignado

        /*
        Tabla de la verdad

        AND               OR           NOT

           | V | F       | V | F       !NOT
         V | V | F     V | V | V    V | F
         F | F | F     F | V | F    F | V

         */
        System.out.println(resultadoAND);
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);



        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        ESTRUCTURAS DE CONTROL

            CONDICIONALES:

            if = si, es?
           else = entonces
        */


        //ESTRUCTURA DE CONTROL IF: Es para cuando se tenga que cumplir alguna condicion y continuar con el flujo

        int edad = 27;
        //== igual
        //!= es distinto (diferente)6
        //< menor
        //> mayor
        //>=
        //<=
        if (edad > 18){
            System.out.println("Puedes entrar a la disco sin problemas");
        }else if(edad == 18) {
            System.out.println("puedes entrar pero enseña tu ine");
        }else {
            System.out.println("no puede entrar a las disco, edad insuficiente");
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ESTRUCTURA DE CONTOL SWITCH: Para elegir alguna opcion
        //Cuando hay demasiados else if


        //¿Que tipo de bebida te gusta?
        String bebida =  "Jugo de naranja";

        switch (bebida){
            case "cafe":
                System.out.println("Buena eleccion a mi tambien me gusta el cafe");
                break;
            case "mate":
                System.out.println("Debes ser argentino o uruguayo");
                break;
            case "gaseosa":
                System.out.println("Debes tener cuidado con el azucar");
                break;
            case "vino":
                System.out.println("Tener cuidado si tomas no manejes");
                break;
            default:
                break;
        }

        if (bebida == "cafe"){
            System.out.println("Buena eleccion a mi tambien me gusta el cafe");
        }else if (bebida == "mate"){
            System.out.println("Debes ser argentino o uruguayo");
        } else if (bebida == "gaseosa") {
            System.out.println("Debes tener cuidado con el azucar");
        } else if (bebida == "vino") {
            System.out.println("Si tomas no manejes");
        }else {
            System.out.println("Disfruta de tu bebida");
        }


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //CLASE SCANNER: PEDIR ESCRIBIR AL USUARIO POR MEDIO DE LA CONSOLA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de bebidad");
        System.out.println("Elige una de las opciones siguienres: ");
        System.out.println("1 Cafe");
        System.out.println("2 Mate");
        System.out.println("3 Gaseosa");
        System.out.println("4 Vino");

        int opcion = scanner.nextInt();


        //Cuando hay demasiados else if


        //¿Que tipo de bebida te gusta?

        switch (opcion){
            case 1:
                System.out.println("CAFE, Buena eleccion a mi tambien me gusta el cafe");
                break;
            case 2:
                System.out.println("MATE, Debes ser argentino o uruguayo");
                break;
            case 3:
                System.out.println("GASEOSA, Debes tener cuidado con el azucar");
                break;
            case 4:
                System.out.println("VINO, Tener cuidado si tomas no manejes");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        if (opcion<= 4){
            System.out.println("Disfrute de su bebida");
        }

        //El teclado ya no siga escuchando y cierre el programa
        //scanner.close();





        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ESTRUCTURA DE CONTROL ITERATIVA, BUCLE FOR

        int i;
        int j;
        int k;

        //for(inicializacion; condicion; actualizacion)
        /*

        for (i = 0; i<=10; i++ ){
            System.out.print(i);

        }
        //System.out.println("el valor en que termino i es:" + i);
        System.out.println("  ");
        */

        //primera ronda i 1, j 1 y k da los 3 k 1,2,3
        //segunda ronda i 1, j 2 y k da los 3 k 1,2,3
        for (i = 1; i<=3 ; i++ ){
            for (j = 1; j<=3; j++){
                for (k = 1; k<=3; k++) {
                    System.out.print(" i: ");
                    System.out.print(i);
                    System.out.print(" j: ");
                    System.out.print(j);
                    System.out.print(" k: ");
                    System.out.println(k);

         /*
         i: 1 j: 1 k: 1
         i: 1 j: 1 k: 2
         i: 1 j: 1 k: 3
         i: 1 j: 2 k: 1
         i: 1 j: 2 k: 2
         i: 1 j: 2 k: 3
         i: 1 j: 3 k: 1
         i: 1 j: 3 k: 2
         i: 1 j: 3 k: 3
         i: 2 j: 1 k: 1
         i: 2 j: 1 k: 2
         i: 2 j: 1 k: 3
         i: 2 j: 2 k: 1
         i: 2 j: 2 k: 2
         i: 2 j: 2 k: 3
         i: 2 j: 3 k: 1
         i: 2 j: 3 k: 2
         i: 2 j: 3 k: 3
         i: 3 j: 1 k: 1
         i: 3 j: 1 k: 2
         i: 3 j: 1 k: 3
         i: 3 j: 2 k: 1
         i: 3 j: 2 k: 2
         i: 3 j: 2 k: 3
         i: 3 j: 3 k: 1
         i: 3 j: 3 k: 2
         i: 3 j: 3 k: 3

         */

                }
            }
        }
        System.out.println(i);
        //System.out.println(j);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ESTRUCTURA DE CONTROL ITERATIVA, WHILE

        int contador = 1;


        //mientras que
        //mientras que se siga cumpliendo la condicion se seguira ejecutando el ciclo


        while (contador <= 10){
            System.out.println(contador);

            //Actualizacion de la variable, siempre
            contador++;
        }


        //Al ya no entrar en la condicion del bucle queda afuera contador  = 6
        //System.out.println(contador);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ESTRUCTURA DE CONTROL ITERATIVA, DO WHILE

        //lo que se ejecuta se declara (do) antes del while
        int contador2= 1;
        do {
            System.out.println("Esto sucede antes de la condicion: " + contador2);

            // Actualizacion de la variable
            contador2++;

        }while(contador2 <= 5);
            System.out.println("Esto sucede despues de la condicion: " + contador2);





        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // CONTROLES DE FLUJO: BREAK, CONTINUE, RETURN

        //int i = 1;


        //BREAK
        /*
        for (i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5){
                System.out.print("Dentro del if si cumple " + i);
                break;
                // al tener el break cumple con que es  i  == 5 por eso ya no imprime el segundo 5
                //solo del primer system.ou.printl(i);
            }
        }


        //CONTINUE
        for (i = 0; i<=10; i++) {
            System.out.println("primer" + i);
            if (i == 5) {

                //Se utiliza para saltar una iteración de un ciclo
                //(while, do-while, for) y continuar con
                //la siguiente iteración.

                //saltea las lineas que continuan del (scope "{}" del for)
                // continue; //sale del bucle en la posicion que esta indicada la condiccion que es el 5
                //lo saltea por eso no parece el 5 del segundo print
            }
            System.out.println("segundo" + i);
        }


        //RETURN
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                //System.out.print("Dentro del if si cumple " + i);
                //el return se utiliza para devolver cosas en otras estructuras
                return;//Se utiliza para cerrar funciones, se corta el codigo (el scope)
                //corta en el 5 y ya no imprime el 5 del printl de abajo
            }
            System.out.println(i);
        }
        */




        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //ARREGLOS : Estructuras de datos que tienen varios valores del mismo tipo y se utiliza el mismo nombre del arreglo
        //arreglo int, arreglo char, ect
        //Estos valores se distribuyen secuencialmenete en la memoria
        //Se puede acceder a ellos a travez de un indice
        // LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES

        //DATO: Los indices en java se inician por 0 y no por 1

        //int[] numeros  = new int[5]; // se puede inicializar asi el arreglo
        //int i = 0;

        //tambien se puede inicializar asi

        //tipodato
        //nombre variable
        //indice  0  1 2  3  4
        int[] numeros  = {10,20,30,40,50};

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        //- Aqui tiene el indice para poder manipularlo que en el foreach no

        numeros[2] = 70; // cambio de valor en indice 2
        for (i = 0; i < numeros.length ; i++) { //length de arreglo va sin parentesis funcion de un arreglo
            System.out.println(numeros[i]);
        }

        //aqui el lenght llava parentesis por que es una funcion
        String palabra = "canserbero";
        System.out.println("la palabra canserbero tiene " + palabra.length() + " letras");

        indice = 0;
        //forEach int
        //elemento de arreglo
        for (int variableeach: numeros){ //no tiene indice
            System.out.println(variableeach);
            System.out.println(indice);
            indice++;
        }



        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //for each string

        String[] nombres =  {"Alondra",  "Javier", "Saul", "Ramon"};

        for ( String aveztruz: nombres){
            System.out.println(aveztruz);
        }

        //Recorrer arreglo con while

        while (i < numeros.length){
            //for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);

            i++;
        }

        //System.out.println(arreglo); // direccion de memoria que utilizara

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);// le asigna el valor cero por default
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros.length);// largo o longitud del arreglo






        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //JUEGO DEL AHORCADO
        // Clase escaner que nos permite que el usuario escriba
        /*
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asiganaciones
        String palabraSecreta = "inteligencia";
        int intetosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglo char de la palabra a adivinar
        //para char es '' comillas simples // para String es "" comillas dobles

        char[] letrasAdivinadas = new char[ palabraSecreta.length()];

        //Estructura de contrl: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }

        //Estructura de contrl: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intetosMax ){
            // De las letras adivinadas es un array de letras
            //lo cual forma una palabra
            // Esto se usa cuando tenemos una palabra de chars
            //valueOF recibe un ARRAY de Chars como parametro y lo convierte a string
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");

            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letracorrecta = false;

            //Estructura de contrl: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++){

                //Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letracorrecta = true;
                }
            }

            //Estructura de control condicional
            if (!letracorrecta){
                intentos++;
                System.out.println("¡Incorrecto, te quedad: " + (intetosMax - intentos) + " intentos!");
            }

                                                //equals si un string es igual al otro
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("!Felicidades!, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        //Estructura de control condicional
        if (!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos, !Game Over¡");
        }

        // Para que no se quede escuchando el teclado
        scanner.close();

        */
    }
}