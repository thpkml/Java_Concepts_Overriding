/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
public class OverridingChild extends OverridingParent{
    
//    This method overrides the show() method of the parent
    @Override
    void show(){
        System.out.println("This is Child's Show!");
    }
}
