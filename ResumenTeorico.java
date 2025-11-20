package Veterinaria;

/**
 * =================================================================================
 * RESUMEN TEÓRICO PARA EL EXAMEN
 * Programación II - Java, POO y Colecciones
 * =================================================================================
 * * ESTE ARCHIVO CONTIENE LA TEORÍA DE LOS PDFS VINCULADA A LA PRÁCTICA DEL PROYECTO.
 * FUENTES: JAVA3 (POO), JAVA4 (Wrappers/Strings), JAVA5 (Colecciones).
 */

public class ResumenTeorico {

    /*
     * -----------------------------------------------------------------------------
     * 1. CLASES, OBJETOS Y HERENCIA (Fuente: java3.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - [cite_start]Clase: Es la plantilla/molde[cite: 843]. Define estado (atributos) y comportamiento (métodos).
     * - [cite_start]Objeto: Es una instancia concreta de una clase en memoria[cite: 844].
     * - [cite_start]Herencia (extends): Mecanismo para reutilizar código y extender funcionalidad[cite: 915].
     * [cite_start]La clase hija hereda todo lo 'public' y 'protected', pero NO lo 'private'[cite: 917].
     * * - Clase Abstracta (abstract): 
     * [cite_start]NO se puede instanciar (no existe 'new ClaseAbstracta()')[cite: 958].
     * Se usa como base de diseño. [cite_start]Si tiene un método abstracto, la clase DEBE ser abstracta[cite: 960].
     * * EN TU PROYECTO (Veterinaria):
     * - Clase Abstracta: 'Animalito'. No existen animalitos genéricos, solo concretos.
     * - Herencia: 'public class Avicolas extends Animalito'.
     * - [cite_start]Constructores: Usamos 'super(...)' en Avicolas para llenar los datos de Animalito[cite: 1239].
     */

    /*
     * -----------------------------------------------------------------------------
     * 2. INTERFACES Y POLIMORFISMO (Fuente: java3.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - Interfaz (implements): Es un "contrato". Define métodos vacíos que la clase
     * [cite_start]está OBLIGADA a implementar[cite: 1287].
     * [cite_start]Diferencia clave: Una clase solo hereda de UNA clase, pero puede implementar MUCHAS interfaces[cite: 1315].
     * * - Polimorfismo (Sobreescritura / Override):
     * [cite_start]Es redefinir un método heredado para cambiar su comportamiento[cite: 1037].
     * [cite_start]Regla: Debe tener la misma firma (nombre y parámetros)[cite: 1050].
     * * EN TU PROYECTO:
     * - Interfaz: 'Cuidados'. Obliga a tener el método 'calcularCostoCuidado()'.
     * - Polimorfismo: 
     * 'Avicolas' calcula el costo según el plumaje.
     * 'Caceras' calcula el costo según la edad y descuento.
     * Ambos responden al mismo mensaje 'calcularCostoCuidado' pero de forma distinta.
     */

    /*
     * -----------------------------------------------------------------------------
     * 3. ENCAPSULAMIENTO Y VISIBILIDAD (Fuente: java3.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - [cite_start]Encapsulamiento: Ocultar datos para protegerlos[cite: 887]. [cite_start]Se usan Getters y Setters[cite: 1122].
     * * MODIFICADORES DE ACCESO:
     * - [cite_start]Private: Solo visible dentro de la propia clase[cite: 1004].
     * - [cite_start]Protected: Visible por las clases hijas (herencia) y el mismo paquete[cite: 1006].
     * - [cite_start]Public: Visible desde cualquier lugar[cite: 1003].
     * * EN TU PROYECTO:
     * - Protected: 'protected String especie' en Animalito. Así 'Avicolas' puede acceder a 'this.especie'.
     * - Private: 'private String tipoPlumaje' en Avicolas. Solo Avicolas conoce su plumaje.
     */

    /*
     * -----------------------------------------------------------------------------
     * 4. LA CLASE OBJECT (Fuente: java5.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * [cite_start]Todas las clases heredan implícitamente de Object[cite: 7].
     * Métodos clave a sobreescribir:
     * 1. toString(): Devuelve la representación en texto. [cite_start]Por defecto da una dirección de memoria[cite: 14, 22].
     * 2. equals(): Compara contenido semántico. [cite_start]'==' compara referencias de memoria[cite: 46].
     * 3. hashCode(): ID numérico para búsquedas rápidas. [cite_start]Si dos objetos son equals, deben tener mismo hash[cite: 138].
     * * EN TU PROYECTO:
     * - toString(): En Animalito, devuelve "Loro - 5 años" en vez de "Animalito@1a2b3c".
     * - equals(): Lo modificaste para que dos animales sean iguales si tienen el mismo NOMBRE.
     * Esto permite que 'lista.contains(animal)' funcione correctamente.
     */

    /*
     * -----------------------------------------------------------------------------
     * 5. COLECCIONES Y GENÉRICOS (Fuente: java5.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - [cite_start]Framework Collection: Almacenes dinámicos de objetos[cite: 82].
     * - [cite_start]List (Interfaz): Ordenada por índice, permite duplicados[cite: 113].
     * [cite_start]-> ArrayList: Rápida para leer (get), lenta para insertar en el medio[cite: 169].
     * - [cite_start]Set (Interfaz): NO permite duplicados, sin orden garantizado (HashSet)[cite: 112].
     * * - [cite_start]Genéricos (<T>): Permiten definir qué tipo de objetos guarda la colección[cite: 611].
     * [cite_start]Evita errores en tiempo de ejecución (ClassCastException)[cite: 640].
     * * EN TU PROYECTO:
     * - Uso: 'private ArrayList<Animalito> avicolas;'
     * - Genérico: <Animalito> asegura que no metamos un Auto en la lista de animales.
     * - Operaciones CRUD usadas: .add(), .get(), .removeIf(), .stream().anyMatch().
     */

    /*
     * -----------------------------------------------------------------------------
     * 6. EXCEPCIONES (Fuente: java3.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - [cite_start]Excepción: Problema en tiempo de ejecución[cite: 1343].
     * - Checked (Exception): Obligatorio manejarlas (try-catch o throws). [cite_start]"No culpa del programador"[cite: 1373].
     * - Unchecked (RuntimeException): Errores de lógica (null pointer, index out of bound). [cite_start]"Culpa del programador"[cite: 1374].
     * * BLOQUES:
     * - [cite_start]try: Código riesgoso[cite: 1376].
     * - [cite_start]catch: Captura y manejo del error[cite: 1378].
     * - [cite_start]finally: Se ejecuta SIEMPRE (cierre de recursos)[cite: 1390].
     * - [cite_start]throw: Lanza una excepción manualmente[cite: 1386].
     * * EN TU PROYECTO:
     * - Personalizada: 'PesoInsuficienteException'.
     * - Lanzamiento: En el constructor de Avicolas: 'if (peso < 1) throw new PesoInsuficienteException()'.
     * - Captura: En el Main, envolvemos la creación en un try-catch para no romper el programa.
     */

    /*
     * -----------------------------------------------------------------------------
     * 7. WRAPPERS Y STRINGS (Fuente: java4.pdf)
     * -----------------------------------------------------------------------------
     * TEORÍA:
     * - [cite_start]Wrappers: Clases que envuelven primitivos (int -> Integer) para usarlos en Colecciones[cite: 1486].
     * Las colecciones NO aceptan primitivos (ArrayList<int> es error).
     * - [cite_start]Autoboxing: Conversión automática de primitivo a objeto[cite: 384].
     * * - Strings: Son INMUTABLES. [cite_start]Una vez creados no cambian[cite: 1551].
     * 's.toUpperCase()' devuelve un NUEVO String, no modifica 's'.
     * * EN TU PROYECTO:
     * - Wrappers: Usamos Integer para la edad en los ArrayList.
     * - Strings: Usamos 'this.nombre = nombre.toUpperCase()' (reasignando) para guardar en mayúsculas.
     */
}
