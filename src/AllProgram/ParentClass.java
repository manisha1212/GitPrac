package AllProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ParentClass {
    int age;
    String name;
    String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int child()
    {
        int c=0;
        Scanner child=new Scanner(System.in);
        System.out.println("Enter Number of Child");
        int number=child.nextInt();
        return number;
    }
}
