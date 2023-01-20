package View;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Узнаем все поля для создания экземпляра класса StandartEmployee
 */
public class SetNewStandartEmployee extends SetBaseEmployee{

    @Override
    public HashMap<String, String> setNewEmployee() {
        String fatherName = null, phone = null, address = null;
        HashMap<String, String> result = super.setNewEmployee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Отчество: ");
        fatherName = sc.nextLine();
        System.out.print("Телефон: ");
        phone = sc.nextLine();
        System.out.print("Адрес: ");
        address = sc.nextLine();

        result.put("patronymic", fatherName);
        result.put("phone", phone);
        result.put("address", address);

        return result;
    }
}
