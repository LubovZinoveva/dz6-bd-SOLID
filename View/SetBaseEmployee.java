package View;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * SetBaseEmployee получает данные для заполнения полей базового сотрудника
 */
public class SetBaseEmployee implements I__SetNewEmployee<HashMap<String, String>>{
    @Override
    public HashMap<String, String> setNewEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Заполните поля.");
        int id = -1;
        String sName = null, fName = null, passport = null;
        HashMap<String, String> result = new HashMap<>();
         
        try{
            System.out.print("id: ");
            id = sc.nextInt();
            System.out.print("Фамилия: ");
            sName = sc.nextLine();
            sName = sc.nextLine();
            System.out.print("Имя: ");
            fName = sc.nextLine();
            System.out.print("Паспорт: ");
            passport = sc.nextLine();
        } catch(InputMismatchException e){
            System.out.print("Введеное значение не является числом. Задайте id заново: ");
        } catch(Exception e){
            e.printStackTrace();
        }
        // sc.close();
        result.put("id", Integer.toString(id));
        result.put("sName", sName);
        result.put("fName", fName);
        result.put("passport", passport);
        return result;   
    }
}
