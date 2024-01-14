package dev.lpa;

public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }

}

//What's happening in the enum is that the enum is just a class, and each of the constants is an instance of that class.
//We can add fields, methods, and even constructors to the enum type.

//Before you add any methods or code in the enum, you have to include ; after the list of values. So the ; is required
//if you're customizing this type any further.