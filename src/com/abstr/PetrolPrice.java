package com.abstr;

import com.sun.jdi.PathSearchingVirtualMachine;

abstract class PetrolPrice {
    abstract void changePrice();  //We are hiding this from the user
}

class Govt extends PetrolPrice{
    void changePrice()
    {
        System.out.println("Incr by 2%");
    }

    public static void main(String[] args) {
        PetrolPrice price = new Govt();
        price.changePrice();
    }
}