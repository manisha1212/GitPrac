package AllProgram;

public class InheritancePrac {
    public static void main(String[] args) {
        ParentClass p=new ParentClass();
        p.setAddress("Pune");
        p.setName("Sharma");
        p.setAge(40);

        Child c=new Child();
        c.setHobby("Cricket");
        c.setHeight(5);
        c.setName("Manisha");
        System.out.println("\n Name is: "+c.getName()+"\n Hobby of "+c.getName()+" is: " +
                ""+c.getHobby()+" \n Height of "+c.getName()+ " is: "+c.getHeight()+"");
        System.out.println(" I am Miss. "+c.getName()+" and my Surname is: "+p.getName()+" and my father's age is: "+p.getAge());


    }

}
