/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class OverrideTest {
    
    public static void main(String[] args){
        
        OverridingParent obj1 = new OverridingParent();
        OverridingParent obj2 = new OverridingChild();
        
        obj1.show();
        obj2.show();
    }
}
