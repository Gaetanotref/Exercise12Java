import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        //INPUT CREATION
        Scanner scanner=new Scanner(System.in);
        //OBJECT CREATION
        Person person1=new Person();
        //INPUT OBJECT
        System.out.println("Insert Name ");
        person1.setName(scanner.nextLine());
        System.out.println("Insert surname ");
        person1.setSurname(scanner.nextLine());
        System.out.println("Insert height ");
        person1.setHeight(scanner.nextDouble());
        System.out.println("Insert age ");
        person1.setAge(scanner.nextInt());
        //PRINT DETAILS
        person1.getDetails();
    }


}
