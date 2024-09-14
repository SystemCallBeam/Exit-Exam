import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CowDataCSV {
    private List<Cow> cows = new ArrayList<>();
    private final String filePath = "cowData.csv";

    public CowDataCSV() {
        loadFromCSV();
    }

    // Load cow data from CSV file
    public void loadFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Skip header row
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String cowId = parts[0];
                    String color = parts[1];
                    int ageYears = Integer.parseInt(parts[2]);
                    int ageMonths = Integer.parseInt(parts[3]);
                    cows.add(new Cow(cowId, color, ageYears, ageMonths));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save cow data to CSV file
    public void saveToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("cowId,color,ageYears,ageMonths");
            writer.newLine();
            for (Cow cow : cows) {
                writer.write(cow.getId() + "," + cow.getColor() + "," + cow.getAgeYears() + "," + cow.getAgeMonths());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Find a cow by its ID
    public Cow findCowById(String cowId) {
        for (Cow cow : cows) {
            if (cow.getId().equals(cowId)) {
                return cow;
            }
        }
        return null;
    }

    // Add a new cow and save to CSV
    public void addCow(Cow cow) {
        cows.add(cow);
        saveToCSV();
    }
}
