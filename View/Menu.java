package View;

import java.util.Scanner;

/*
 * класс Menu обращается к пользователю для выбора режима работы с базой данных 
 */
public class Menu  implements I__Menu{

    @Override
    public Integer setMod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("МЕНЮ\n1. Открыть базу для просмотра\n2. Удалить сотрудника\n3. Внести изменения\n4. Добавить сотрудника\n5. Найти сотрудника"); 
        Integer numMod = sc.nextInt(); 
        sc.nextLine();
        return numMod;
    }
    
}
