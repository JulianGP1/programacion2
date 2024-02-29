
package com.mycompany.mavenproject1;

import people.Character;
public class Mavenproject1 {

    public static void main(String args[]) {
        Character homero = new Character("homero", 39, 'm', "a la grande le puse cuca");
        homero.saySomthing();
        
        Character bart = new Character("bart", 10, 'm', "caramba");
        bart.saySomthing();
        
        Character apu=new Character();
        apu.setName("apu");
        apu.setPhrase("volvas pronto");
    }

  

    }

