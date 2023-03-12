public class Maintain {
    private String roomNum;
    private String descrption;
    private String status;

    public Maintain() {
    }

    public Maintain(String roomNum, String descrption, String status) {
        this.roomNum = roomNum;
        this.descrption = descrption;
        this.status = status;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
