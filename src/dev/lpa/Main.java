package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRI){
//                System.out.println("Found a Friday!!!");
//            }

            switchDayOfWeek(weekDay);
        }

        for (Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }

    }

    public static DayOfTheWeek getRandomDay(){

        //Setting the bound value sets a boundary or limit to our nextInt method.
        int randomInteger = new Random().nextInt(7);
        //Enum types have a method called values() that returns an array of all the enum constant values.
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase()
             + "day is Day " + weekDayInteger);
        }

    }

}

//Enumeration:

//The enum type is Java's type to support something called enumeration.

//Wikipedia defines enumeration as, "A complete ordered listing of all the items in a collection".

//Java describes the enum type as: A special data type that contains predefined constants.

//A constant is a variable whose value can't be changed, once it's value has been assigned.

//So an enum is a little like an array, except it's elements are known, not changeable, and each element can be
//referred to by a constant name, instead of an index position.

//public enum DayOfTheWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

//An enum, in its simplest form, is described like a class, but the keyword enum replaces the keyword class.

//You can name the enum with any valid identifier, but like a class, Upper CamelCase is the preferred style.

//Within the enum body, you declare a list of constant identifiers, separated by commas. By convention, these are all
//uppercase labels.

//One example of an enum is the days of the week, as shown above.

//An enum is ordered by the way you declare constants.

//This means that SUNDAY is considered the first day of the week, and SATURDAY is the last day of the week.

//The enum type is used to declare a limited set of constants, and sometimes there is a natural order to the listing,
//as in the case of days of the week.

//Some other examples of possible enum declarations might be:

//The months in the year: JANUARY, FEBRUARY, MARCH, etc.

//The directions in a compass: EAST, NORTH, SOUTH, WEST.

//A set of sizes: EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE.

//Underneath the covers, the enum type is a special type of class which contains fields to support the constants.

//You don't have to understand all the internals of an enum, to derive the benefits of using this type.

//There are many places you can use an enum.

//They simplify your code and make it easier to read in many ways.
