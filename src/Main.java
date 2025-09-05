import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* // Среднее арифметическое N чисел Ввод: N, затем N целых. Вывести: среднее с точностью, например, до 3 знаков.


        int n = sc.nextInt();
        double sum = 0;
        double average = 0;
        for (int i = 0; i < n; i++){
            double inputN = sc.nextInt();
            sum += inputN;
        }
        average = sum / n;
        String result = String.format("%.3f",average);
        System.out.println(result);
 */
        // Подсчёт положительных из N вводимых Ввод: N, затем N целых. Вывести: сколько из них > 0.

        int n = sc.nextInt();
        int chislo;
        int positive = 0;

        for (int i = 0; i < n; i++){
            chislo = sc.nextInt();
            if (chislo > 0){
                positive++;
            }
        }
        System.out.println(positive);



    }
}