package View;

import java.util.Scanner;

/*
 * В классе SetSearchInfo собираем информацию, по которой потом будем искать сотрудника
 */
public class SetSearchInfo implements I__SetSearchInfo {
    @Override
    public String setSearchInfo() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите любую информацию о сотруднике: ");
        String info = iScanner.nextLine();
        // info = iScanner.nextLine();
        // iScanner.close();
        return info;
    }
}
