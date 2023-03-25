/**
 * представляет собой конкретные классы, которые расширяют AbstractPhone и реализуют makeCall()
 */
public class StationaryPhone extends AbstractPhone {
    public StationaryPhone(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Dialing " + number + " on stationary phone " + getPhoneNumber());
    }
}
