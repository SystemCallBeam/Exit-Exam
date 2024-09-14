import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CowControl {
    private CowView view;
    private CowDataCSV model;

    public CowControl(CowView view, CowDataCSV model) {
        this.view = view;
        this.model = model;

        // Add a listener to the submit button
        this.view.addSubmitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
    }

    // Validate the cow ID input and calculate the milk production
    public void handleSubmit() {
        String cowId = view.getCowIdInput();

        // Validate cow ID: must be 8 digits and not start with 0
        if (validateCowId(cowId)) {
            Cow cow = model.findCowById(cowId);
            if (cow != null) {
                int milkProduction = cow.calculateMilkProduction();
                view.setResultText("Cow ID " + cowId + " produces " + milkProduction + " liters of " + cow.getColor() + " milk.");
            } else {
                view.setResultText("Cow not found!");
            }
        } else {
            view.setResultText("Invalid Cow ID!");
        }
    }

    // Validation method for cow ID
    private boolean validateCowId(String cowId) {
        return cowId.matches("[1-9][0-9]{7}");
    }
}
