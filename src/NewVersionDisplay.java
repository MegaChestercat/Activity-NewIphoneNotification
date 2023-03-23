public class NewVersionDisplay implements Display, Observer{
    boolean newVersion;
    PhoneData data;
    String version;

    public NewVersionDisplay(PhoneData data){
        this.data = data;
        data.registerObserver(this);
    }
    public void display(){
        if(newVersion){
                System.out.println("Hey there client "+ (data.clientNum+1) + ". There is a new iPhone version available: " + version);
        }
    }
    public void update(boolean newVersion, String version){
        this.newVersion = newVersion;
        this.version = version;
        display();
    }
}
