import java.util.ArrayList;

public class PhoneData implements Subject{
    public ArrayList<Observer> obs;
    boolean newVersion;
    String version;
    public int clientNum;

    public PhoneData(){
        obs = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        obs.add(o);
    }
    public void removeObserver(Observer o){
        obs.remove(o);
    }
    public void notifyObservers(){
        for(clientNum = 0; clientNum < obs.size(); clientNum++){
            Observer o = obs.get(clientNum);
            o.update(newVersion, version);
        }
    }

    public void MeasurementsChanged(){
        notifyObservers();
    }

    public void setIPhoneVersion(boolean newVersion, String version){
        this.newVersion = newVersion;
        this.version = version;
        MeasurementsChanged();
    }
}
