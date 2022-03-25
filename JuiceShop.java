/*
Enums restrict a variable to have one of only a few predefined values. 
The values in this enumerated list are called enums.

With the use of enums it is possible to reduce the number of bugs in your code.

For example, if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. 
This would make sure that it would not allow anyone to order any size other than small, medium, or large.
*/

class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
 }
 
 public class JuiceShop {
 
    public static void main(String args[]) {
       FreshJuice juice = new FreshJuice();
       juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
       System.out.println("Size: " + juice.size);
    }
 }
