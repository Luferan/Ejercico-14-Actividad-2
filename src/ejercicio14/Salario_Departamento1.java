/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;
public class Salario_Departamento1 {
    public static double salar1(double VD1, double VD2, double VD3, double SALAR){
    double SALAR1, TOTVEN, PORVEN;
    TOTVEN = VD1 + VD2 + VD3;
    PORVEN = 0.33 * TOTVEN;
    
    if (VD1 > PORVEN){
        SALAR1 = SALAR + 0.2 * SALAR;
    }
    else {
        SALAR1 = SALAR;
    }
    return SALAR1;
    }
}
