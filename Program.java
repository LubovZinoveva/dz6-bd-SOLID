

import java.io.File;

import Presenter.StandartPresenter;
/*
 * Через класс Program осуществляется запуск программы. Задается путь к файлу и вызывается метод для начала работы
 * программы с базой данных. 
 */
public class Program {
    public static void main(String[] args) {
        StandartPresenter app = new StandartPresenter();

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/Employee.txt");
        File f = new File(pathFile);

        app.startWork(f.getAbsolutePath());
        
    }
}
