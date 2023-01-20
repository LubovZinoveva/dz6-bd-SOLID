package Presenter;

import java.util.HashMap;
import java.util.HashSet;
import EmployeeInformation.StandartEmployee;
import Logger.Read;
import Logger.Write;
import Model.DeleteEmployeeMod;
import Model.PrintDataMod;
import Model.StandartReplaceMod;
import Model.SearchStandartEmployeeMod;
import View.Menu;
import View.NextStep;
import View.SetId;
import View.SetNewStandartEmployee;
import View.SetReplaceInfo;
import View.SetSearchInfo;

/*
 * Presenter берет данные из методов View и применяет на конкретных моделях из папки Model, 
 * применяя для сохранения/загрузки Logger. 
 */
public class StandartPresenter {
    public void startWork(String path){
        Menu menu = new Menu();
        Read<StandartEmployee> reader = new Read<>();
        Write writer = new Write();

        HashSet<StandartEmployee> staff = reader.read(path);
        int chooseMod = menu.setMod();
        System.out.println();
        
        switch (chooseMod) {
            case 1:
                PrintDataMod<StandartEmployee> print = new PrintDataMod<StandartEmployee>();
                System.out.println("     СПИСОК СОТРУДНИКОВ");
                System.out.println("------------------------------");
                print.printData(staff);
                break;
            case 2:
                DeleteEmployeeMod<StandartEmployee> del = new DeleteEmployeeMod<StandartEmployee>();
                SetId delId = new SetId();
                staff = del.deleteEmployee(staff, delId.setIdForDelete());
                writer.write(path, staff);
                break;
            case 3:
                SetReplaceInfo info = new SetReplaceInfo();
                StandartReplaceMod modReplace = new StandartReplaceMod();
                HashMap<String, String> re = info.setReplacementInfo();
                staff = modReplace.replaceInfo(staff, Integer.parseInt(re.get("id")), re.get("column"), re.get("newData"));
                writer.write(path, staff);
                break;
            case 4:      
                SetNewStandartEmployee setInfo = new SetNewStandartEmployee();
                HashMap<String, String> inf = setInfo.setNewEmployee();
                StandartEmployee newEmpl = new StandartEmployee(Integer.parseInt(inf.get("id")), 
                inf.get("sName"), inf.get("fName"), inf.get("patronymic"), inf.get("phone"), inf.get("address"), inf.get("passport"));
                staff.add(newEmpl);
                writer.write(path, staff);
                break;
            case 5:
                SetSearchInfo sInfo = new SetSearchInfo();
                SearchStandartEmployeeMod sMod = new SearchStandartEmployeeMod();
                sMod.employeeSearch(staff, sInfo.setSearchInfo());
                break;
            default:
                System.out.println("Неверный режим, попробуйте заново.");
                break;
        }
        NextStep what = new NextStep();
        String answ = what.continueStep();
        if(answ.equals("yes")) startWork(path);
    }
}
