/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
/**
 *
 * @author Piyaporn
 */
public class HeadQuarter implements Source {
    private final ArrayList<MyObserver> list;
    private String data;
    
    public HeadQuarter() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setData(String aData) {
        data = aData;
        notifyObservers();
    }
    public String getData() {
        return data;
    }
    
    @Override
    public void create(MyObserver observer) {
        list.add(observer);
    }
    
    @Override
    public void notifyObservers() {
        for(int i = 0; i < list.size(); ++i) {
            list.get(i).update(this);
        }
    }
}
