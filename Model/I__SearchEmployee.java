package Model;

/*
 * интерфейс I__SearchEmployee находит сотрудника по инфорамции criteria
 */
public interface I__SearchEmployee<T, V> {
    void employeeSearch(V staff, T criteria);
}
