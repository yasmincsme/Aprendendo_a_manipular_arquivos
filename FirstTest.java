import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class FirstTest {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Salary: ");
        double salary = input.nextFloat();

        FileOutputStream archive =
                new FileOutputStream("C:\\Users\\meira\\Downloads\\GitHub\\Aprendendo_a_manipular_arquivos\\FirstTest");

        DataOutputStream gravador = new DataOutputStream(archive);

        String toString = (String) "Name: " + name + ", Age: " + age + ", Salary: " + salary;
        gravador.writeUTF(toString);
        gravador.close();
    }
}
