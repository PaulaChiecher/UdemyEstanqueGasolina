import java.util.Scanner;
/*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el
resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente*/
public class EstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de gasolina en el estanque (en litros): ");
        double cantidadGasolina = scanner.nextDouble();
        String mensaje = cantidadGasolina >= 70 ? "El estanque está lleno" : "";
        mensaje = cantidadGasolina < 70 && cantidadGasolina >= 60 ? "Estanque casi lleno" : mensaje;
        mensaje = cantidadGasolina < 60 && cantidadGasolina >= 40 ? "Estanque 3/4" : mensaje;
        mensaje = cantidadGasolina < 40 && cantidadGasolina >= 35 ? "Medio lleno" : mensaje;
        mensaje = cantidadGasolina < 35 && cantidadGasolina >= 20 ? "Suficiente" : mensaje;
        mensaje = cantidadGasolina < 20 && cantidadGasolina >= 1 ? "Insuficiente" : mensaje;
        mensaje = mensaje.isEmpty() ? "No hay gasolina en el estanque" : mensaje;
        System.out.println(mensaje);
    }
}
