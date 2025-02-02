import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new  Scanner(System.in);

        String name;
        int age;
        double weight;
        boolean smoker;

        System.out.println("Name: ");
        name = scanner.nextLine();

        System.out.println("Age: ");
        age = scanner.nextInt();

        System.out.println("Weight: ");
        weight = scanner.nextDouble();
        
        System.out.println("Smoker: ");
        smoker = scanner.nextBoolean();

        System.out.println(name + " , " + age + " , " + weight + " , " + smoker);
    }
}