package View;

import java.util.HashMap;
import java.util.Scanner;

/*
 * В классе SetReplaceInfo собираем с пользователя id сотрудника, название столбца, 
 * где заменим информацию на актуальную
 */
public class SetReplaceInfo implements I__SetReplaceInfo<HashMap<String, String>> {

    @Override
    public HashMap<String, String> setReplacementInfo() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> result = new HashMap<>();
        System.out.print("Введите id сотрудника: ");
        String id = sc.nextLine();
        System.out.print("Напишите название столбца для замены(sName, fName, patronymic, phone, address, passport): ");
        String column = sc.nextLine();
        System.out.print("Новые данные: ");
        String newData = sc.nextLine();
        System.out.println();

        result.put("id", id);
        result.put("column", column);
        result.put("newData", newData);
        return result;
    }
    
}
