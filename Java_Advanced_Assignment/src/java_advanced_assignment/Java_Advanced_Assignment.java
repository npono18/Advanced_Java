/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_advanced_assignment;

/**
 *
 * @author S332629690
 */
public class Java_Advanced_Assignment {
    enum Directions{
        N, NE, E, SE, S, SW, W, NW;
 
        Directions direction;
            this.direction = d;
        }
    }
    
    public void guy(Directions x){
        switch(x){
            case N:
                System.out.println("NORTH");
                break;
            case NE:
                System.out.println("NORTHEAST");
                break;
            case E:
                System.out.println("EAST");
                break;
            case SE:
                System.out.println("SOUTHEAST");
                break;
            case S:
                System.out.println("SOUTH");
                break;
            case SW:
                System.out.println("SOUTHWEST");
                break;
            case W:
                System.out.println("WEST");
                break;
            case NW:
                System.out.println("NORTHWEST");
                break;
        }
    }
    
    public static void main(String[] args) {
        String dir = "N";
        Main garb = new Main(Directions.valueOf(dir));
        garb.fullDirection();
    }
       
    }
    

