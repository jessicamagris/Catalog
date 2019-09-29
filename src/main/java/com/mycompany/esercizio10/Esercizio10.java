/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio10;

/**
 *
 * @author jessi
 */

import java.util.Arrays;

/**
 *
 * @author jessi
 */
public class Esercizio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String in=   "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
            "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n\n" +
            "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n\n" +
            "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n\n" +
            "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>\n\n" +
            "<prod><name>chair</name><prx>100</prx><qty>20</qty></prod>\n\n" +
            "<prod><name>fan</name><prx>50</prx><qty>8</qty></prod>\n\n" /*+
            "<prod><name>wire</name><prx>10.8</prx><qty>15</qty></prod>\n\n" +
            "<prod><name>battery</name><prx>150</prx><qty>12</qty></prod>\n\n" +
            "<prod><name>pallet</name><prx>10</prx><qty>50</qty></prod>\n\n" +
            "<prod><name>wheel</name><prx>8.80</prx><qty>32</qty></prod>\n\n" +
            "<prod><name>extractor</name><prx>105</prx><qty>17</qty></prod>\n\n" +
            "<prod><name>bumper</name><prx>150</prx><qty>3</qty></prod>\n\n" +
            "<prod><name>ladder</name><prx>112</prx><qty>12</qty></prod>\n\n" +
            "<prod><name>hoist</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
            "<prod><name>platform</name><prx>65</prx><qty>21</qty></prod>\n\n" +
            "<prod><name>car wheel</name><prx>505</prx><qty>7</qty></prod>\n\n" +
            "<prod><name>bicycle wheel</name><prx>150</prx><qty>11</qty></prod>\n\n" +
            "<prod><name>big hammer</name><prx>18</prx><qty>12</qty></prod>\n\n" +
            "<prod><name>saw for metal</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
            "<prod><name>wood pallet</name><prx>65</prx><qty>21</qty></prod>\n\n" +
            "<prod><name>circular fan</name><prx>80</prx><qty>8</qty></prod>\n\n" +
            "<prod><name>exhaust fan</name><prx>62</prx><qty>8</qty></prod>\n\n" +
            "<prod><name>cattle prod</name><prx>990</prx><qty>2</qty></prod>\n\n" +
            "<prod><name>window fan</name><prx>62</prx><qty>8</qty></prod>"*/;
    ;
    
        System.out.println(catalog(in));
    }//fine main
    
    public static String catalog(String in){
        String[]a=in.split("\n\n");
    StringBuilder out = new StringBuilder();
    String[] b;
        //System.out.println(Arrays.toString(a));
        
        //System.out.println(Arrays.toString(Arrays.toString(a[0].split(">")).split("<")));
       // System.out.println(" ");
        
        b=a[0].split(">");
        //System.out.println(Arrays.toString(b));
        //System.out.println("    ");
//        System.out.println(Arrays.toString(b[2].split("<")));
        //System.out.println(" ");
        String[]f;
        String[]p; 
        String[]q; 
//out.append(f[0]);
        //System.out.println(out);
        for (int i = 0; i <=a.length-1; i++) {
            b=a[i].split(">");
            //System.out.println(Arrays.toString(b));
            f=b[2].split("<");  
            //System.out.println(Arrays.toString(f));
            p=b[4].split("<");
            q=b[6].split("<");
            //System.out.println(Arrays.toString(q));
            out.append(f[0]).append(" > prx: $ ").append(p[0]).append(" ").append("qty: ").append(q[0]).append(" ").append("\n");
            
        }
        return out.toString();
    }
    
}//fine classe
