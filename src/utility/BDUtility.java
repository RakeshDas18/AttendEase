/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package utility;

//import java.io.*; 

import java.util.*;
import javax.swing.*;


/**
 *
 * @author LENOVO
 */
public class BDUtility {
    
    private static HashMap<String, JFrame> formsMap = new HashMap<>();
    
    public static void openForm(String formName, JFrame formInstance){
        JFrame existingForm = formsMap.get(formName);
        
        if(existingForm == null || !existingForm.isVisible()){
            formsMap.put(formName, formInstance);
            formInstance.setVisible(true);
        } else {
            existingForm.toFront();
        }
    }
    
   
}
