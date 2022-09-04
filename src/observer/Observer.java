/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

/**
 *
 * @author Piyaporn
 */
import java.util.Scanner;

public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Registrant1 obj1 = new Registrant1();
        Registrant2 obj2 = new Registrant2();
        HeadQuarter obj = new HeadQuarter();
        
        obj.create(obj1);
        obj.create(obj2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            obj.setData(str);
        }

    }
    
}
