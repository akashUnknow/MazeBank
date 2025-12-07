module org.akash.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.commons;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens org.akash.mazebank to javafx.fxml;
    exports org.akash.mazebank;
    exports org.akash.mazebank.Controller;
    exports org.akash.mazebank.Controller.Admin;
    exports org.akash.mazebank.Controller.Client;
    opens org.akash.mazebank.models;
    opens org.akash.mazebank.views;
}