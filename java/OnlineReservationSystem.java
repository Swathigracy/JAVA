import java.sql.*;
import java.util.*;

public class OnlineReservationSystem {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private Scanner scanner; // Added scanner instance

    public OnlineReservationSystem() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_reservation_system", "root", "");
            statement = connection.createStatement();
            scanner = new Scanner(System.in); // Initialize the scanner
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(String username, String password) {
        try {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeReservation(String trainNumber, String trainName, String classType, String dateOfJourney, String fromStation, String toStation) {
        try {
            String sql = "INSERT INTO reservations (train_number, train_name, class_type, date_of_journey, from_station, to_station) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, trainNumber);
            preparedStatement.setString(2, trainName);
            preparedStatement.setString(3, classType);
            preparedStatement.setString(4, dateOfJourney);
            preparedStatement.setString(5, fromStation);
            preparedStatement.setString(6, toStation);
            preparedStatement.executeUpdate();

            System.out.println("Reservation successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelReservation(String pnrNumber) {
        try {
            String sql = "DELETE FROM reservations WHERE pnr_number = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pnrNumber);
            preparedStatement.executeUpdate();

            System.out.println("Reservation canceled!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OnlineReservationSystem system = new OnlineReservationSystem();

        // Login
        System.out.println("Enter username: ");
        String username = system.scanner.nextLine();
        System.out.println("Enter password: ");
        String password = system.scanner.nextLine();
        system.login(username, password);

        // Make reservation
        System.out.println("Enter train number: ");
        String trainNumber = system.scanner.nextLine();
        System.out.println("Enter train name: ");
        String trainName = system.scanner.nextLine();
        System.out.println("Enter class type: ");
        String classType = system.scanner.nextLine();
        System.out.println("Enter date of journey (YYYY-MM-DD): ");
        String dateOfJourney = system.scanner.nextLine();
        System.out.println("Enter from station: ");
        String fromStation = system.scanner.nextLine();
        System.out.println("Enter to station: ");
        String toStation = system.scanner.nextLine();
        system.makeReservation(trainNumber, trainName, classType, dateOfJourney, fromStation, toStation);

        // Cancel reservation
        System.out.println("Enter PNR number: ");
        String pnrNumber = system.scanner.nextLine();
        system.cancelReservation(pnrNumber);
    }
}
