package Model;

/*
 * I__DeleteEmployee удаляет сотрудника из бд по id
 */
public interface I__DeleteEmployee<T> {
    T deleteEmployee(T staff, Integer id);
}
