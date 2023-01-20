package Model;

import java.util.HashSet;
import EmployeeInformation.BaseEmployee;

/**
 * PrintData пtxfnftn всю базу данных в терминал
 */
public class PrintDataMod<T extends BaseEmployee> implements I__PrintData<HashSet<T>> {

    @Override
    public void printData(HashSet<T> staff) {
        for(T man : staff){
            System.out.println(man);
        }
    }
    
}
