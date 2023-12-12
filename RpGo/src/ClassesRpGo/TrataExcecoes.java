/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesRpGo;

public class TrataExcecoes {
    public static boolean verificaInt(String inteiro){
        try{
            Integer.parseInt(inteiro);
            
            return true;
        }
        catch(NumberFormatException a){    
            return true;
        }
    }
}
