import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String codePin = "1234";
        double balance = 500;

        System.out.println("Pin kodunuzu daxil edin");
        String pin = sc.nextLine();

        if (pin.equals(codePin)) {
            System.out.println(" Giris ugurludur ");
            System.out.println(" Balansiniz " + balance + " AZM ");
        } else {
            System.out.println("Pin ugursuzdur");
        }
        //PIN doğru olsa balans göstərir.

        //Yanlış olsa giriş icazəsi vermir.

    }
}