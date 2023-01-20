package Model;

import java.util.HashSet;
import EmployeeInformation.StandartEmployee;

/*
 * SearchStandartEmployeeMod осуществляет поиск стандартного сотрудника и выводит его на экран  
 */
public class SearchStandartEmployeeMod extends SearchBaseEmployeeMod<StandartEmployee>{
    @Override
    public void employeeSearch(HashSet<StandartEmployee> staff, String criteria) {
        super.employeeSearch(staff, criteria);
        HashSet<StandartEmployee> res = new HashSet<>();
        for(StandartEmployee man : staff){
            if( man.getPatronymic().equals(criteria) || man.getPhone().equals(criteria) || man.getAddress().equals(criteria)){
                res.add(man);
            }
        }
        if(res != null){
            for(StandartEmployee item : res){
                System.out.println(item);
            }
        }
    }  
}
