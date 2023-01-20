package Logger;

/*
 * Интерфейс I__Load<T> отвечает за загрузку сотрудников из базы данных
 */
public interface I__Load<T> {
    T read(String path);
}
