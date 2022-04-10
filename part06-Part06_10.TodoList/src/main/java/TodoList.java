import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bileg
 */
public class TodoList {
    private ArrayList<String> doList;
    
    public TodoList(){
        this.doList = new ArrayList<>();
    }
    public void add(String task){
        this.doList.add(task);
    }
    public void print(){
        for(int i = 1; i < doList.size()+1; i++){
            System.out.println((i)+": "+doList.get(i-1));
        }
    }
    public void remove(int number){
        doList.remove(number-1);
    }
}
