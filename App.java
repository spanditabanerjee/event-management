//import java.sql.*;
public class App {
    public static void main(String[] args) {
        Database db = new Database();
    //Connection connection = new Database("192.168.29.1").connect();
    //if(connection != null) {
       // String sql = "SELECT * FROM event_mgmt";
        //String sql = "UPDATE tbl set column_name = value";

        //try {
        //ResultSet resultSet = connection.createStatement().executeQuery(sql);
        //while(resultSet.next()) {
            //System.out.println(resultSet.getString(1));
        //}

        //} catch (SQLException ignored) {
        //}
//}

        ParticipantsUtility participantsUtility = new ParticipantsUtility(db);
        EventsUtility eventsUtility = new EventsUtility(db);
        Menu menu = new Menu(participantsUtility, eventsUtility);
        menu.runMainMenu();
    }

}