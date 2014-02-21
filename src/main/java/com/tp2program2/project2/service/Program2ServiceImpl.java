/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2program2.project2.service;

/**
 *
 * @author student
 */
public class Program2ServiceImpl implements Program2Service
{

    public double add(double a, double b) {
      return a + b;  
    }

    public boolean checkTrue(boolean a) {
        if(10==10) 
        {
           return true; 
        }
        
        else
            return false;
            
    }

    public boolean checkFalse(boolean a) {
       if(5==6)
       {
           return false;
       }
       else
           return true;
    }

    public Integer notNull(Integer obj) {
         return obj;
    }

    public Integer isNull(Integer obj) {
        return obj;
    }
    
    public boolean isSame(int a, int b) {
       
    return (a==b);
    
    }

    public boolean assertMessage(String a, String b) {
        return a.equalsIgnoreCase(b);
    }
    
}
