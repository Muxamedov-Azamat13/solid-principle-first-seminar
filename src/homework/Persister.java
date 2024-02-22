package homework;

public class Persister implements SaveAble{
    private final SaveAble saveAble;

    public Persister(SaveAble saveAble) {
        this.saveAble = saveAble;
    }


    @Override
    public void save() {
        saveAble.save();
    }
}
