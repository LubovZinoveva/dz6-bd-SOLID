package EmployeeInformation;

import java.io.Serializable;

/*
 * BaseEmployee - базовый сотрудник, с наименьшим набором данных, который возможен для создания карточки сотрудника
 */
public class BaseEmployee implements Serializable {
    private Integer id;
    private String sName;
    private String fName;
    private String passport;

    public BaseEmployee(Integer id, String sName, String fName, String passport) {
        this.id = id;
        this.sName = sName;
        this.fName = fName;
        this.passport = passport;
    }

    public Integer getId() {
        return id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    
    @Override
    public String toString() {
        return String.format("id: %d, Фамилия: %s, Имя: %s, паспорт: %s", 
        this.getId(), this.getsName(), this.getfName(), this.getPassport());
    }
}
