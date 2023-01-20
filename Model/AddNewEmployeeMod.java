package Model;

import java.util.HashSet;

/*
 * Добавляет нового сотрудника в список сотрудников
 */
public class AddNewEmployeeMod<T> implements I__AddNewEmployee<T> {

    public HashSet<T> addNewEmployee(HashSet<T> staff, T man) {
        staff.add(man);
        return staff;
    }
}
