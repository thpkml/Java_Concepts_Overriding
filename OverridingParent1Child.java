/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class OverridingParent1Child extends OverridingParent1{
    private void m1(){
        System.out.println("From child method m1.");
    }
    
    @Override
    public void m2(){
        System.out.println("From child method m2.");
    }
}
