/*
The no argument constructors of Java does not accept any parameters instead, 
using these constructors the instance variables of a method will be initialized with fixed values for all objects.
*/
public class ConsDemoNoArg {
    public static void main(String args[]) {
        MyClassNoArg t1 = new MyClassNoArg();
        MyClassNoArg t2 = new MyClassNoArg();
        System.out.println(t1.num + " " + t2.num);
     }
}
