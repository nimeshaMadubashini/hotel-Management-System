public class Room {
    private String rmNum;
    private String bedCp;
    private String price;
    private String rmStatus;

    public Room() {
    }

    public Room(String rmNum, String bedCp, String price, String rmStatus) {
        this.rmNum = rmNum;
        this.bedCp = bedCp;
        this.price = price;
        this.rmStatus = rmStatus;
    }

    public String getRmNum() {
        return rmNum;
    }

    public void setRmNum(String rmNum) {
        this.rmNum = rmNum;
    }

    public String getBedCp() {
        return bedCp;
    }

    public void setBedCp(String bedCp) {
        this.bedCp = bedCp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRmStatus() {
        return rmStatus;
    }

    public void setRmStatus(String rmStatus) {
        this.rmStatus = rmStatus;
    }
}
