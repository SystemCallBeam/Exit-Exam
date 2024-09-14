public class Cow {
    private String id;
    //how to create enum data type?
    private String color;
    private int ageYears;
    private int ageMonths;

    //how to recieve enum parametor?
    Cow (String id, String color, int ageYears, int ageMonths) {
        this.id = id;
        this.color = color;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(int ageYears) {
        this.ageYears = ageYears;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public void setAgeMonths(int ageMonths) {
        this.ageMonths = ageMonths;
    }

}