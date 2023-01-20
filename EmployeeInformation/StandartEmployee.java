package EmployeeInformation;

import java.io.Serializable;

/*
 * Класс StandartEmployee - экземпляры данного класса являются стандартными сотрудниками некой компании. 
 * У сотрудника есть id, ФИО, телефон, адрес и номер паспорта.
 */
public class StandartEmployee extends BaseEmployee implements Serializable {
    
    private String patronymic;
    private String phone;
    private String address;
    

    public StandartEmployee(Integer id, String sName, String fName, String patronymic, String phone,
            String address, String passport) {
        super(id, sName, fName, passport);
        this.patronymic = patronymic;
        this.phone = phone;
        this.address = address;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhone(String phoneNumber) {
        this.phone = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return String.format("id: %d, Фамилия: %s, Имя: %s, Отчество: %s, телефон: %s, адрес: %s, паспорт: %s", 
        this.getId(), this.getsName(), this.getfName(), this.getPatronymic(), this.getPhone(), 
        this.getAddress(), this.getPassport());
    }
}
