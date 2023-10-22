interface InDriver{
    public void requestRide(String rideDetails);
    public void callClient(String clientPhone);
    public void processPayment(String paymentDetails);
}
class Yandex implements InDriver{

    @Override
    public void requestRide(String rideDetails) {

    }

    @Override
    public void callClient(String clientPhone) {

    }

    @Override
    public void processPayment(String paymentDetails) {

    }
}

public class Adapter{
    public static void main(String[] args) {
        InDriver adapter = new Yandex();
        String rideDetails = "Start: street Mangilik el 55, Destination: Saryarka 67";
        adapter.requestRide(rideDetails);
        String clientPhone = "+7(775)2387012";
        adapter.callClient(clientPhone);
        String paymentDetails = "Amount of summary: 3700 tg, Method: credit card";
        adapter.processPayment(paymentDetails);
        System.out.println(rideDetails);
        System.out.println(clientPhone);
        System.out.println(paymentDetails);
    }
}