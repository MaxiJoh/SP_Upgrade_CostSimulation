import java.util.List;
import java.util.Collections;

public class Upgrade {
    private Specialist sp;
    private List<Item> items;
    private boolean success;
    private int probability;


    public Specialist getSp() {
        return sp;
    }
    public void setSp(Specialist sp) {
        this.sp = sp;
    }
    public List<Item> getItems() {
        return this.items != null ? Collections.unmodifiableList(this.items) : Collections.emptyList();
    }
    public Upgrade setItems(List<Item> items) {
        this.items = items;
        return this;
    }
    public boolean isSuccess() {
        return success;
    }
    public Upgrade setSuccess(boolean success) {
        this.success = success;
        return this;
    }
    public int getProbability() {
        return probability;
    }
    public Upgrade setProbability(int probability) {
        this.probability = probability;
        return this;
    }
}

