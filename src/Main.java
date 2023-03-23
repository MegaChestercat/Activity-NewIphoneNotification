public class Main {
    public static void main(String[] args){
        PhoneData data = new PhoneData();

        NewVersionDisplay client1 = new NewVersionDisplay(data);
        NewVersionDisplay client2 = new NewVersionDisplay(data);
        NewVersionDisplay client3 = new NewVersionDisplay(data);
        NewVersionDisplay client4 = new NewVersionDisplay(data);

        data.setIPhoneVersion(true, "Pro 17 Max");

        NewVersionDisplay client5 = new NewVersionDisplay(data);
        NewVersionDisplay client6 = new NewVersionDisplay(data);
        NewVersionDisplay client7 = new NewVersionDisplay(data);
        NewVersionDisplay client8 = new NewVersionDisplay(data);

        data.setIPhoneVersion(true, "Pro 20 Max");
    }
}
