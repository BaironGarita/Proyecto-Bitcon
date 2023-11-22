/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconceptos;
import java.util.Arrays;

/**
 *
 * @author nicol
 */
public class tableClass {

   

public class MatrizAleatoria {
    private int[][] matriz;

    public MatrizAleatoria() {
        matriz = new int[6][6];
        generarMatrizAleatoria();
    }

    private void generarMatrizAleatoria() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int num = (int) (Math.random() * 66);
                matriz[i][j] = num;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sb.append(matriz[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    
}

    
}
