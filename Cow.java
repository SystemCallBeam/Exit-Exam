public class Cow {
    private int code;
    //how to create enum data type?
    private Color color;
    private int age_years;
    private int age_months;

    //how to recieve enum parametor?
    Cow (int code, Color color, int age_years, int age_months) {
        this.code = code;
        this.color = color;
        this.age_years = age_years;
        this.age_months = age_months;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge_years() {
        return age_years;
    }

    public void setAge_years(int age_years) {
        this.age_years = age_years;
    }

    public int getAge_months() {
        return age_months;
    }

    public void setAge_months(int age_months) {
        this.age_months = age_months;
    }

}

/**
 * Color
 */
enum Color {
    white,
    brown,
    pink
}