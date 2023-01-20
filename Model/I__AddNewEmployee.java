package Model;

import java.util.HashSet;

/*
 * Интерфейс I__AddNewEmployee<T> задает метод добавления нового сотрудника
 */
public interface I__AddNewEmployee<T> {
    public HashSet<T> addNewEmployee(HashSet<T> staff, T man);
}
