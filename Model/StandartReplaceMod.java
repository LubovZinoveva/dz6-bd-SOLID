package Model;

import java.util.HashSet;
import EmployeeInformation.StandartEmployee;


/*
 * Класс StandartReplaceInfo заменяет информацию о стандартном сотруднике на актуцальную(info2) в определенном столбце(info1)
 */
public class StandartReplaceMod extends BaseReplaceMod<StandartEmployee> {

    @Override
    public HashSet<StandartEmployee> replaceInfo(HashSet<StandartEmployee> staff, Integer id, String info1, String info2) {
        super.replaceInfo(staff, id, info1, info2);
        for(StandartEmployee man : staff){
                        if(id.equals(man.getId())){
                            switch(info1){
                                case "patronymic":
                                    man.setPatronymic(info2);
                                    break;
                                case "phone":
                                    man.setPhone(info2);
                                    break;
                                case "address":
                                    man.setAddress(info2);
                                    break;
                                default:
                                    System.out.println("Столбец не найден, попробуйте заново.");
                            }
                        }
                    }
        return staff;
    }
}