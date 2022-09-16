import com.solvd.Army.connection.ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Main {
    public static void main(String[] args) {
        final Logger LOGGER = LogManager.getLogger(Main.class);
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/armydb", "Oleksii", "chess24")){
            ConnectionPool connectionPool = ConnectionPool.getInstance("jdbc:mysql://localhost:3306/armydb", "Oleksii", "chess24");
           LOGGER.info("Database connected, instance created");

        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }
    }
}