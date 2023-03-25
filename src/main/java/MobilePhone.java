/**
 * добавляет brandи model поля и геттеры для них
 */
public class MobilePhone extends AbstractPhone {
    private String brand;
    private String model;

    public MobilePhone(String phoneNumber, String brand, String model) {
        super(phoneNumber);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Dialing " + number + " on mobile phone " + brand + " " + model + " with number "
                + getPhoneNumber());
    }
}
