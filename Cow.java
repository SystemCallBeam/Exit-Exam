public class Cow {
    private String id;
    // how to create enum data type?
    private String color;
    private int ageYears;
    private int ageMonths;

    // how to recieve enum parametor?
    Cow(String id, String color, int ageYears, int ageMonths) {
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

    public String getMilk() {
        switch (color) {
            case "white":
                return "plain";
            case "brown":
                return "chocolate";
            case "pink":
                return "strawberry";

            default:
                return "mystery";
        }
    }

    public int getTotalAgeInMonths() {
        return ageYears * 12 + ageMonths;
    }

    public int calculateMilk() {
        switch (color) {
            case "white":
                return plainMilk(); // Plain milk
            case "brown":
                return chocolateMilk(); // Chocolate milk
            case "pink":
                return strawberryMilk(); // Strawberry milk
            default:
                return 0;
        }
    }

    public int plainMilk() {
        return 120 - getTotalAgeInMonths();
    }

    public int chocolateMilk() {
        return 40 - ageYears;
    }

    public int strawberryMilk() {
        return 30 - ageMonths;
    }
}