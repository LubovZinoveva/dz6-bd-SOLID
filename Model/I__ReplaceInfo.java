package Model;

/*
 * I__ReplaceInfo<T, E> Обновляет информацию о сотруднике. E - тип списка сотрудиков. 
 */
public interface I__ReplaceInfo<T, E> {
    E replaceInfo(E staff, Integer id, T info1, T info2);
}
