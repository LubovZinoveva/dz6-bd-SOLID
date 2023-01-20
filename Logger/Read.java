package Logger;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

import EmployeeInformation.BaseEmployee;

/*
 * Read считывает объекты из файла и помещает в HashSet
 */
public class Read<T extends BaseEmployee> implements I__Load<HashSet<T>> {
    @Override
    public HashSet<T> read(String path) {
        HashSet<T> staff = new HashSet<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean status = true;
            while (status) {
                try {
                    if(fis.available() != 0){
                    staff.add((T) ois.readObject()); 
                    } else {
                        status = false;
                        ois.close();
                    }  
                } catch (EOFException e) {
                    e.printStackTrace();
                }
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return staff;
    }
}
