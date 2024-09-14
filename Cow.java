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

}

/**
 * Color
 */
enum Color {
    white,
    brown,
    pink
}