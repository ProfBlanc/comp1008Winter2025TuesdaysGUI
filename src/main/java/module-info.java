module ca.georgiancollege.comp1008winter2025tuesdaysgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008winter2025tuesdaysgui to javafx.fxml;
    exports ca.georgiancollege.comp1008winter2025tuesdaysgui;

}