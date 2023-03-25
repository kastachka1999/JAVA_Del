/**
 * это абстрактный класс, который реализует Phone и добавляет phoneNumber для него поле и геттер
 */
public abstract class AbstractPhone implements Phone {
    private String phoneNumber;

    public AbstractPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
