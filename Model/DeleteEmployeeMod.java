package Model;

import java.util.HashSet;
import EmployeeInformation.BaseEmployee;

/*
 * DeleteEmployeeMod удаляет сотрудика из базы 
 */
public class DeleteEmployeeMod<T extends BaseEmployee> implements I__DeleteEmployee<HashSet<T>> {

    @Override
    public HashSet<T> deleteEmployee(HashSet<T> staff, Integer id) {

        T manDel = null;
        for(T man : staff){
            if(id.equals(man.getId())){
                manDel = man;
            }
        }
        staff.remove(manDel);
        System.out.println("Сотрудник успешно удален.");
        return staff;
    }
    
}
