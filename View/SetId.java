package View;

import java.util.Scanner;

/*
 * Узнаем id сотрудника, которого будем удалять
 */
public class SetId implements I__SetId {

    @Override
    public Integer setIdForDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите id сотрудника для удаления из базы: ");
        Integer delId = sc.nextInt();
        return delId;
    }
    
}
