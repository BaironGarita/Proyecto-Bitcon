/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appconceptos;

/**
 *
 * @author Geovanny
 */
public class Ficha {

    public static final int QUINARIO = 5;
    public static final int OCTAL = 8;
    public static final int DECIMAL = 10;
    public static final int DUODECIMAL = 12;
    public static final int HEXADECIMAL = 16;

    private int numDec;
    private String numQui;
    private String numOct;
    private String numDuo;
    private String numHex;
    boolean salio;

    public Ficha() {
        this.salio = false;
    }

    public void setNumDec(int numDec) {
        this.numDec = numDec;
        this.numOct = Integer.toOctalString(numDec);
        this.numHex = Integer.toHexString(numDec).toUpperCase();
        this.numQui = DecimalQuinario(numDec);
        this.numDuo = DecimalDuodecimal(numDec);

    }
    
    public String DecimalQuinario(int numero) {
        String Hilera = "";
        StringBuilder TempHilera = new StringBuilder();
        if (numero == 0) {
            Hilera += "0";
        }
        while (numero > 0) {
            int residuo = numero % 5;
            TempHilera.insert(0, residuo);
            numero /= 5;
        }
        Hilera+=TempHilera;
        return Hilera;
    }
    
    public String DecimalDuodecimal(int numero) {
        String Hilera = "";
        StringBuilder TempHilera = new StringBuilder();
        if (numero == 0) {
            Hilera += "0";
        }
        while (numero > 0) {
            int residuo = numero % 5;
            if(residuo == 10){
                TempHilera.insert(0, "A");
            }else if (residuo == 11){
                TempHilera.insert(0, "B");
            }else if(residuo == 12){
                TempHilera.insert(0, "C");
            }else{
                TempHilera.insert(0, residuo);
            }
            numero /= 5;
        }
        Hilera+=TempHilera;
        return Hilera;
    }
    

    public boolean isSalio() {
        return salio;
    }

    public void setSalio(boolean salio) {
        this.salio = salio;
    }

    public int getNumDec() {
        return numDec;
    }

    //  @Override
    public String toString(int baseNumerica) {
        String CaracterInicial = "";
        String CaracterFinal = "";
        String Hilera = "";
        if (this.salio) {
            CaracterInicial = "[";
            CaracterFinal = "]";
        }

        if (baseNumerica == QUINARIO) {
            Hilera = CaracterInicial + this.numQui + CaracterFinal;
        } else {
            if (baseNumerica == OCTAL) {
                Hilera = CaracterInicial + this.numOct + CaracterFinal;
            } else {
                if (baseNumerica == DECIMAL) {
                    Hilera = CaracterInicial + this.numDec + CaracterFinal;
                } else {
                    if (baseNumerica == DUODECIMAL) {
                        Hilera = CaracterInicial + this.numDuo + CaracterFinal;
                    } else {
                        Hilera = CaracterInicial + this.numHex + CaracterFinal;
                    }
                }
            }
        }
        return Hilera;
    }

}
