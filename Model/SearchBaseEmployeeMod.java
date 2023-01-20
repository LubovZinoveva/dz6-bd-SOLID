package Model;

import java.util.HashSet;

import EmployeeInformation.BaseEmployee;

/**
 * В классе SearchBaseEmployeeMod поиск базового сотрудника по имеющейся информации
 */
public class SearchBaseEmployeeMod<T extends BaseEmployee> implements I__SearchEmployee<String, HashSet<T>> {
    
    @Override
    public void employeeSearch(HashSet<T> staff, String criteria) {
        HashSet<T> result = new HashSet<>();
        for(T man : staff){
            if(Integer.toString(man.getId()).equals(criteria) || man.getfName().equals(criteria) || 
            man.getsName().equals(criteria) || man.getPassport().equals(criteria)){
                result.add(man);
            }
        }
        for(T item : result){
            System.out.println(item);
        }
    }
}
