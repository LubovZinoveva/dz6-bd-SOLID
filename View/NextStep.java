package View;

import java.util.Scanner;

/*
 * NextStep получает ответ, нужно ли продолжить работу с базой данных
 */
public class NextStep implements I__NextStep {

    @Override
    public String continueStep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Хотите продолжить работу с базой сотрудников? Напишите yes/no");
        String answer = sc.nextLine();
        return answer.toLowerCase();
    }
    
}
