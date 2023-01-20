package Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

// import EmployeeInformation.BaseEmployee;
import EmployeeInformation.StandartEmployee;

public class Write implements I__Save<HashSet<StandartEmployee>>{
    @Override
    public void write(String path, HashSet<StandartEmployee> data) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {
            fout = new FileOutputStream(path);
            oos = new ObjectOutputStream(fout);
            for(StandartEmployee man : data){
                oos.writeObject(man);
            }
            oos.close();
            System.out.println("Done");
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
}
