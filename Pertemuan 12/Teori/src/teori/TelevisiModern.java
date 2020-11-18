/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teori;

/**
 *
 * @author User
 */
public class TelevisiModern extends Elektronik{
    private String modelInput;

    public TelevisiModern() {
    }
    
    public TelevisiModern(String modelInput) {
        this.modelInput = modelInput;
    }
        
    public String getModelInput(){
        return modelInput;
    }
}
