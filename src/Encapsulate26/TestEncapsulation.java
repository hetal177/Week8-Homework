package Encapsulate26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting value of the variables
        obj.setName("Hetal");
        obj.setAge(38);
        obj.setRollNo(101);

        // Displaying values of the variables

        System.out.println("Prime's name:" + obj.getName());
        System.out.println("Prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());

        //Direct access of roll no is not possible due to encapsulation

        //System.out.println("Prime's roll no :" + obj.geekName);


    }

}


