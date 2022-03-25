public class TestLocalVariable {
    public void pupAge() {
        // int age;
        // The above line will cause error because local variables don't have a default value
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
     }
  
     public static void main(String args[]) {
        TestLocalVariable test = new TestLocalVariable();
        test.pupAge();
     }
}
