package com.vikram;

enum Days {
    Monday;
}

enum Direction {
    //constants of type Direction
    NORTH("I can see Sun."),
    SOUTH("I can still see Sun"),
    WEST("Sun sets in West."),
    EAST("Sun rises from East.");

    //instance variable
    String msg;

    //constructor
    Direction(String msg) {
        this.msg = msg;
    }

    //instance methods
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class Main {

    Direction direction;

    public Main(Direction direction) {
        this.direction = direction;
    }

    public static void main(String[] args) {
        /*
        Iterate thru the enum constants using values() fun which
        returns array of constants of type Direction
         */

        for (Direction direction : Direction.values()) {
            System.out.println("Direction name : " + direction);
        }


        //Direction direction = new Direction("Dummy String msg");
        /*
        this cannot be done as Direction("") constructor is private implicitly
        and Hence you cannot create instance of Direction outside of Enum Direction.
         */

        /*
        Now instead of creating Object of Enum Direction using new key as it isn't allowed
        We can use one of already created Object of Enum Direction.
         */
        Direction direction = Direction.EAST;

        //Creating object of Main class
        Main myDir = new Main(direction);

        //Using direction attribute of myDir object of main class in Switch
        switch (myDir.direction) {
            case EAST:
                System.out.println("East case matched!");
                break;
            case WEST:
                System.out.println("West case matched!");
                break;
            case NORTH:
                System.out.println("North case matched!");
                break;
            case SOUTH:
                System.out.println("South case matched!");
                break;
            default:
                System.out.println("None cases matched!");
        }

        System.out.println("Index of EAST is : " + Direction.EAST.ordinal());

        System.out.println("EAST enum constant is : " + Direction.valueOf("NORTH-EAST"));

    }
}
