/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
public class Incentivos {
    public static void main(String[] args) {
        // TODO code application logic here
        double VD1, VD2, VD3, SALAR, SALAR1, SALAR2, SALAR3;
        Scanner ventas = new Scanner(System.in);
        System.out.println("Ingrese el valor de ventas del departamento 1: ");
        VD1 = ventas.nextDouble();
        
        System.out.println("Ingrese el valor de ventas del departamento 2: ");
        VD2 = ventas.nextDouble();
        
        System.out.println("Ingrese el valor de ventas del departamento 3: ");
        VD3 = ventas.nextDouble();
        
        System.out.println("Ingrese el salario de los vendedores en cada departamento: ");
        SALAR = ventas.nextDouble();
        
        // Se crean clases para calcular el salario de cada departamento
        SALAR1= Salario_Departamento1.salar1(VD1,VD2,VD3, SALAR);
        SALAR2= Salario_Departamento2.salar2(VD1,VD2,VD3, SALAR);
        SALAR3= Salario_Departamento3.salar3(VD1,VD2,VD3, SALAR);
        
        System.out.println("Salario vendedores Depto.1: " +SALAR1);
        System.out.println("Salario vendedores Depto.2: " +SALAR2);
        System.out.println("Salario vendedores Depto.3: " +SALAR3);
    }
}
