/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testingeventreservation;

/**
 *
 * @author RC_Student_lab
 */
 ;
public class TestingEventReservation {

    public static void main(String[] args) {
        
    public void testCheckbookingCode(){
        System.out.println("checkbookingCode");
        boolean expResult = false;
        boolean result = EventReservation.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   //NOW we check for password
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        boolean expResult = false;
        boolean result = EventReservation.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    }

