import javafx.scene.control.TextField;

public class income {
    private String mon;
    private String value;

    public income(String month, TextField value) {
    }

    public income(String mon, String value) {
        this.mon = mon;
        this.value = value;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
