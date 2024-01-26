package CEJE2;

//Definición de la clase Estudiante
public class Estudiante {
 // Atributos de la clase
 private String nombre;         // Nombre del estudiante
 private double[] calificaciones; // Array para almacenar las calificaciones

 // Constructor de la clase
 public Estudiante(String nombre, double[] calificaciones) {
     this.nombre = nombre;             // Asignación del nombre
     this.calificaciones = calificaciones; // Asignación de las calificaciones
 }

 // Método para calcular el promedio de las calificaciones
 public double calcularPromedio() {
     double suma = 0; // Inicialización de la variable suma
     for (double calificacion : calificaciones) { // Bucle para sumar todas las calificaciones
         suma += calificacion;
     }
     return suma / calificaciones.length; // Calcula y retorna el promedio
 }

 // Método para obtener la calificación final basada en el promedio
 public char obtenerCalificacionFinal(double promedio) {
     // Estructura condicional para determinar la calificación final
     if (promedio <= 50) return 'F';
     else if (promedio <= 60) return 'E';
     else if (promedio <= 70) return 'D';
     else if (promedio <= 80) return 'C';
     else if (promedio <= 90) return 'B';
     else return 'A';
 }

 // Método para imprimir en pantalla los resultados
 public void imprimirResultados() {
     // Muestra el nombre del estudiante
     System.out.println("Nombre del estudiante: " + nombre);
     // Bucle para mostrar cada calificación
     for (int i = 0; i < calificaciones.length; i++) {
         System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
     }
     // Calcula el promedio
     double promedio = calcularPromedio();
     // Muestra el promedio
     System.out.println("Promedio: " + promedio);
     // Obtiene y muestra la calificación final
     System.out.println("Calificación: " + obtenerCalificacionFinal(promedio));
 }

 // Método main para probar la clase
 public static void main(String[] args) {
     // Creación de un array de calificaciones de ejemplo
     double[] calificaciones = {100, 80, 90, 60, 90};
     // Creación de un objeto de la clase Estudiante
     Estudiante estudiante = new Estudiante("Jesus Vega", calificaciones);
     // Llamada al método para imprimir los resultados
     estudiante.imprimirResultados();
 }
}