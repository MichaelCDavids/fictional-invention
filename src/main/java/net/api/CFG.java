package net.api;

class GFG {
    public static void main(String[] args) {

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str = new StringBuilder("Tony Stark will die");

        // print string
        System.out.println("String length = "+ str.length() +" and contains = \"" + str + "\"");

        // set length equal to 25
        str.setLength(15);
        str.setLength(25);

        // print string
        System.out.println("After setLength() String = \""+ str.toString() + "\"");
        System.out.println(str.length());
    }
}
