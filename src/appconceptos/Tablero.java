/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconceptos;

/**
 *
 * @author Geovanny
 */
public class Tablero {
    public static final int DIM01 = 6;
    public static final int DIM02 = 6;
    private Ficha objTablero[][] = new Ficha[DIM01][DIM02];
      
    public void GeneraTablero() {
        int numRandom; 
        for (int DIM01 = 0; DIM01 < this.DIM01; DIM01++) {
            for (int DIM02 = 0; DIM02 < this.DIM02; DIM02++) {
                Ficha ObjTempFicha = new Ficha();
                numRandom = (int) (Math.random()*95);
                ObjTempFicha.setNumDec(numRandom);
                objTablero[DIM01][DIM02] = ObjTempFicha;
            }
        }
       
    }
    
    /*public String imprimeTablero() {
        String Hilera = "";
        Ficha objTempFicha = new Ficha();
        for (int DIM01 = 0; DIM01 < this.DIM01; DIM01++) {
            for (int DIM02 = 0; DIM02 < this.DIM02; DIM02++) {
                objTempFicha = objTablero[DIM01][DIM02];
                if (objTempFicha != null) {
                    Hilera += ""+objTempFicha.toString(Ficha.DECIMAL)+"\t";
                }
            }
            Hilera += "\n";
        }
        return Hilera;    
    }*/
    
    public String imprimeTablero(int sistemaNumerico) {
        String Hilera = "";
        Ficha objTempFicha = new Ficha();
        for (int DIM01 = 0; DIM01 < this.DIM01; DIM01++) {
            for (int DIM02 = 0; DIM02 < this.DIM02; DIM02++) {
                objTempFicha = objTablero[DIM01][DIM02];
                if (objTempFicha != null) {
                    Hilera += ""+objTempFicha.toString(sistemaNumerico)+"\t";
                }
            }
            Hilera += "\n";
        }
        return Hilera;
        
    }
    
    public boolean buscarFicha (String numeroBuscar){
        int numero = Integer.parseInt(numeroBuscar);
        boolean encontro = false;
        Ficha objTempFicha = new Ficha();
        for (int DIM01 = 0; DIM01 < this.DIM01; DIM01++) {
            for (int DIM02 = 0; DIM02 < this.DIM02; DIM02++) {
                objTempFicha = objTablero[DIM01][DIM02];
                if (objTempFicha.getNumDec() == numero) {
                    objTempFicha.setSalio(true);
                    objTablero[DIM01][DIM02] = objTempFicha;
                    encontro = true;
                    //break;
                }
            }
        }
        return encontro;
    }
    
    
/*
    public void GeneraTableros () {
        for (int DIM01 = 0; DIM01 < 100; DIM01++) {
            
        }
       this.GeneraTableroCol01();
       this.GeneraTableroCol02();
       this.GeneraTableroCol03();
    .
    .
    .
    }
    
    private void GeneraTableroCol01 () {
    }
    private void GeneraTableroCol02 () {
    }
    private void GeneraTableroCol03 () {
    }   
*/
}