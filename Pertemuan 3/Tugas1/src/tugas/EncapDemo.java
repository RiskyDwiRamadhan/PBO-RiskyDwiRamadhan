/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas;

/**
 *
 * @author User
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge >=18 && newAge <= 30){
            age = 30;
        }else{
            System.out.println("Maaf age anda kurang dari 18 atau lebih dari 30");
        }
    }
}
