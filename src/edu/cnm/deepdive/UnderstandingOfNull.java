package edu.cnm.deepdive;

public class UnderstandingOfNull {

  static Object myObject = new Object();
  static Object myOtherObject;

  static String myString;

  public static void main(String[] args) {
    Object myLocalObject = new Object();
    //Object anotherLocalObject; local variable not initialized so will not work

    String name = "Java";
    String anotherName = null;

    System.out.println("myObject = " + myObject);
    System.out.println("myOtherObject = " + myOtherObject);
    System.out.println("myLocalObject = " + myLocalObject);
  //  System.out.println("anotherLocalObject = " + anotherLocalObject); is a local variable but not initialized.
    System.out.println("String name = " + name);
    System.out.println("String another name = " + anotherName);

    myString.toLowerCase();
    System.out.println("myString = " + myString);//this will give you a nullPointerException because
    //myString has not been initialized hence there is no reference to an object. Impossible to run
    //a method like toLowerCase().


  }
}
