public class Customer {
    private String name;
    private String nic;
    private String add;
    private String email;
    private String tele;
    private String checkIn;
    private String checkOut;
    private String meal;
    private String rmNum;

    public Customer() {
    }

    public Customer(String name, String nic, String add, String email, String tele, String checkIn, String checkOut, String meal, String rmNum) {
        this.name = name;
        this.nic = nic;
        this.add = add;
        this.email = email;
        this.tele = tele;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.meal = meal;
        this.rmNum = rmNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getRmNum() {
        return rmNum;
    }

    public void setRmNum(String rmNum) {
        this.rmNum = rmNum;
    }
}
