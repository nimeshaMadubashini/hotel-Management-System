public class Local_Meal {
    private String packNum;
    private String mealPack;

    public Local_Meal() {
    }

    public Local_Meal(String packNum, String mealPack) {
        this.packNum = packNum;
        this.mealPack = mealPack;
    }

    public String getPackNum() {
        return packNum;
    }

    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    public String getMealPack() {
        return mealPack;
    }

    public void setMealPack(String mealPack) {
        this.mealPack = mealPack;
    }
}
