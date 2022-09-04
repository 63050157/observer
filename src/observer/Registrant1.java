/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Piyaporn
 */
public class Registrant1 implements MyObserver {
    @Override
    public void update(Source s) {
        System.out.println("Live Result : " +((HeadQuarter)s).getData());
    }
}
