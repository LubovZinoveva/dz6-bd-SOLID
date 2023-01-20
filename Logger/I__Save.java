package Logger;

/*
 * I__Save<T> отвечает за сохранение в файл
 */
public interface I__Save<T> {
    void write(String path, T data);
}
