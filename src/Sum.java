import java.util.Scanner; // импорт сканера

class Sum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 любых дробных числа: ");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        System.out.print("ответ " + (number1 + number2));
    }
}
