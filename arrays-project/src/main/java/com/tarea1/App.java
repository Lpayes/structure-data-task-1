package com.tarea1;
import java.util.Arrays;
import static java.lang.System.out;
//ojo: Ingeniero cree tre arreglos para los diferentes puntos que me pide y tambien omiti el uso de las tildes.
/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
    	// a) "Hola mundo"
        out.println("Hola mundo desde Java");
        
        // b) multiplicacion de dos numeros 
        int num1 = 2;
        int num2 = 9;
        int resultado = num1*num2;
        out.println("Resultado de la Multiplicacion:" + resultado);
        //Investigación de arreglos en java
        
        //¿Cómo se declara un arreglo en Java?
        
        int[] numeros = new int[4];// Forma 1: Declaración con tamaño fijo
        numeros[0] = 10; // Asignación uno por uno, es decir por indice.
        out.println("Valores del arreglo de la Forma 1: " + Arrays.toString(numeros));// aca imprimo el arreglo
        
        int[] valores = {1, 2, 3, 4, 5}; // La Forma 2 es la de inicialización directa.Es decir definir el tamaño y contenido en la misma linea
        out.println("Valores del arreglo de la Forma 2: " + Arrays.toString(valores));//aca imprimo el arreglo
        
        //Metodos y utilidades principales para arreglos
        
             // 1) Arrays.sort()
        int[] misNumeros = {12, 344, 56, 8};
        Arrays.sort(misNumeros);  //Este ordena un arreglo desordenado de numeros, es decir; de menor a mayor
        out.println("Valores del nuevo arreglo misNumeros ordenado: " + Arrays.toString(misNumeros)); // Ahora las edades en el arreglo estan en las posiciones: {8, 12, 56, 344}
       
            // 2) Arrays.binarySearch(arreglo, valor)
        int posicion = Arrays.binarySearch(misNumeros, 56); // acá se esta buscando donde quedo el numero 56 si se me olvido
        out.println("El número 56 se encuentra en el índice: " + posicion); // el resultado que devolvera en este caso es el "2" ya que en el arreglo ordenado esta en la posicion 2
        
           // 3) Arrays.fill(arreglo, valor)
           //Esta en el final para no causar problemas al ejecutar la app3
        
           // 4) Arrays.copyOfRange(arreglo, desde, hasta)
        int[] recorte = Arrays.copyOfRange(misNumeros, 1, 3); 
           // OJO: El indice final (3) es exclusivo. 
           // Toma la posicion 1 (12) y la 2 (56), pero se detiene ANTES de la posición 3 (344).
           // Resultado real: {12, 56}
        out.println("El recorte (índice 1 al 2) es: " + Arrays.toString(recorte));
        
            // 5) Arrays.stream().max()
        int maximo = java.util.Arrays.stream(misNumeros).max().getAsInt();// busca el numero mas alto de la lista
            // Resultado: 344
        out.println("El numero mas grande es: " + maximo);
        
            // ¿Cómo se recorren los arreglos en Java?
        
            // Para mostrar los elementos de mi arreglo int[] misNumeros = {12, 344, 56, 8};, podemos usar las siguientes estructuras:
        
            // 1) For-each (avanzado)
        for (int num : misNumeros) {
        	// En cada vuelta del ciclo, Java toma UN número del arreglo y lo guarda automáticamente en la variable "num"
        out.println("Valor encontrado: " + num);
            // Al terminar esta línea, Java salta al siguiente espacio del estante y repite el proceso hasta que ya no quedan más números
        }
        
            // 2) For tradicional (con indices)
        
        for (int i = 0; i < misNumeros.length; i++) {
            
            // "i" es el indice. Empieza en 0 y el ciclo sigue mientras "i" sea menor al tamaño del arreglo (.length).
            
            out.println("En la posición " + i + " está el: " + misNumeros[i]);
            
            // Al final de cada vuelta, i++ le suma 1 al contador para pasar al siguiente espacio del arreglo
            
            
            //Streams (Usando la API de Java 8+)
            
        }
        
     // 3) Streams (Arrays.stream)
     // Esta forma usa la API de Java 
     Arrays.stream(misNumeros).forEach(num -> {
         
         // Aquí la API hace todo: ella solita recorre el arreglo y me va soltando los números
         out.println("La API me está pasando el: " + num);
         
         // No ocupo contador ni saber el tamaño, la API sabe cuándo parar solita
     });
     
     // Diferencias entre arreglos y ArrayList en Java
     //En Java, aunque los dos sirven para guardar listas de cosas, la diferencia es como comparar una caja de cartón con una bolsa de tela elástica.
     // 1) Tamaño fijo vs. Tamaño dinámico
     //----Arreglo (int[]): Es fijo. Si se crea de 4 espacios, solo le caben 4 cosas. Es como una caja de madera con divisiones: si se quiere meter una quinta cosa, simplemente no cabe,se tendría que tirar esa caja y construir una nueva desde cero.
     //----ArrayList: Es dinámico : Esta se puede comparar como una fila de personas. Si llega alguien nuevo, simplemente se pone al final y la fila se hace más larga. No se tiene que reservar lugar desde el principio, la fila crece o se acorta según se necesite.
     // 2) Tipos primitivos vs clases envolventes
     //----Arreglo: Este acepta números "puros" (como int o double).
     //----ArrayList: Este si se pone un poco más exigente y pidiendo que los números vengan en "clases" (objetos). Por eso se ve que se usa Integer en lugar de int.
     // 3) Métodos disponibles (add, remove, size, etc.) Para ArrayList
     //----.add(valor): Este es para meter datos. No tienes que decirle en qué posición; él simplemente lo pone al final de la fila.
     //----.remove(índice): Este sirve para sacar a alguien de la lista. Lo mejor es que, si see saca al que está en medio, los que estaban atrás se recorren solitos para cerrar el hueco. En un arreglo normal, ese espacio se quedaría vacío o tendrías que mover a todos tú mismo.
     //----.get(índice): Como aquí no se usan los corchetes [], usas este método para ver qué hay en una posición. Es como decir: "Oye, pásame lo que tiene el cajón número 2".
     //----.size(): En los arreglos usas .length, pero aquí usas .size(). Te dice exactamente cuántos elementos hay guardados en ese momento.
     //----.clear(): Si quieres vaciar toda la lista de un solo golpe y dejarla en blanco, usas este y ya está.
     // 4) Rendimiento
     //----Arreglo (int[]): Esteves el campeón en velocidad. Como es una estructura muy simple y no cambia de tamaño, la computadora sabe exactamente dónde está cada dato. Gasta poquita memoria y procesa todo rapidamente.
     //----ArrayList: Es un poquito más pesado. Porque como es elastico, por dentro Java tiene que estar revisando si todavía hay espacio y si no hay, tiene que crear un nuevo espacio, nuevo más grande y pasar todo lo viejo a la nueva. Eso gasta un poquito más de memoria y tiempo.
     // 5)¿Cuándo usar cada uno?
     //----Se usa un Arreglo (int[]) cuando: Ya se sabe el número exacto, se quiere velocidad máxima o se tiene una memoria limitada.
     //----Se usa un ArrayList cuando: No se tinen idea de cuantos datos llegaran, se estara borrando y metiendo contenido y por la comodidad del uso de los metodos como .add() y .remove() en lugar de andar peleándote con los índices [i].
    
  // Lo movi al final para que no borre los datos antes de imprimirlos
     // 3) Arrays.fill(arreglo, valor)
     Arrays.fill(misNumeros, 0); // este sirve cuando quiero resetear el arreglo, es decir una forma de poner el mismo valor en todos los espacios. En mi caso puse el "0"
         // Ahora todos los espacios son cero: {0, 0, 0, 0}
     out.println("Arreglo reseteado.");
    }
        
}
