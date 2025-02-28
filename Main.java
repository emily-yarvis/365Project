import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

package com.company;
import java.sql.*;

public class Main extends Application {

    static   Connection connect;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("project.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:mysql://ambari-node5.csc.calpoly.edu/rjhamnan", "rjhamnan", "029198175"); // Replace with database name (username), username, and password

            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM STUDENTS;");
            while (rs.next()) {
                String studentName = rs.getString(1); // name is first field
                System.out.println("Student name = " +
                        studentName);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}