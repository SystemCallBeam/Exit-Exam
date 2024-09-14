public class Main {
    public static void main(String[] args) {
        // Create the model, view, and controller
        CowDataCSV model = new CowDataCSV();
        CowView view = new CowView();
        CowControl controller = new CowControl(view, model);

        // Make the GUI visible
        view.setVisible(true);
    }
}
