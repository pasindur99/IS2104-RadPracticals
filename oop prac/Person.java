public class Person {

    public int nic;
    public String name;
    public double height;
    public double weight;
    public int salary;

    public Person(){
        this.salary = 1000;
    }


    public void setPersonDetails(
            int nic, String name, double height, double weight
    ){
        this.nic = nic;
        this.name = name;
        this.height = weight;
        this.weight = weight;
    }

    public void showPersonDetail(int x){
        System.out.println("");
        System.out.println("Person : " + x);
        System.out.println("NIC : " +nic);
        System.out.println("Name : " + name);
        System.out.println("Weight : " + weight);
        System.out.println("Height : " + height);
        System.out.println("Salary : " + salary);
    }


    public static void main (String[] args){


        
        /*
            Person p1 = new Person();
            p2.nic = 1234;
            p2.name = "Anne";
            p2.height = 5.2;
            p2.weight = 45.8;
         */
	Person p1 = new Person();
        p1.setPersonDetails(23456, "Bob", 6.5, 45.1);
        
        Person p2 = new Person();
        p2.setPersonDetails(34567,"Cindy", 4.8, 45.1);

        p1.showPersonDetail(1);
        p2.showPersonDetail(2);

    }

}

