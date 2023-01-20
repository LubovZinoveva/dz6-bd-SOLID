package Model;

import java.util.HashSet;
import EmployeeInformation.BaseEmployee;

/*
 * Класс BaseReplaceInfo заменяет информацию о базовом сотруднике на актуцальную(info2) в определенном столбце(info1)
 */

public class BaseReplaceMod<T extends BaseEmployee> implements I__ReplaceInfo<String, HashSet<T>> {
    @Override
    public HashSet<T> replaceInfo(HashSet<T> staff, Integer id, String info1, String info2) {
        
        for(T man : staff){
            if(id.equals(man.getId())){
                switch(info1){
                    case "id":
                        System.out.println("id нельзя поменять.");
                        break;
                    case "sName":
                        man.setsName(info2);
                        break;
                    case "fName":
                        man.setfName(info2);
                        break;
                    case "passport":
                        man.setPassport(info2);
                        break;
                }
            }
        }
        return staff;
    }
}
