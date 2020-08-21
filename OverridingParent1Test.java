/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class OverridingParent1Test {
    public static void main(String[] args){
        
        OverridingParent1 obj1 = new OverridingParent1();
        OverridingParent1 obj2 = new OverridingParent1Child();
        
//        obj1.m1();  // Cannot override private method
        obj1.m2();
//        obj2.m1(); // Cannot override method with private access
        obj2.m2();
    }
}
