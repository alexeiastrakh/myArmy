import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.compiler.PluginProtos;
import com.solvd.Army.Airplane;
import com.solvd.Army.ArmoredPersonnelCarrier;
import com.solvd.Army.ArmoredWeapons;
import com.solvd.Army.Submarine;
import com.solvd.Army.connection.ConnectionPool;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.solvd.Army.dao.AirplaneDAO;
import com.solvd.Army.dao.ArmoredPersonnelCarrierDAO;
import com.solvd.Army.dao.SubmarineDAO;
import com.solvd.Army.util.Jaxb;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;



public class Main {
    public static void main(String[] args) throws IOException {
        final Logger LOGGER = LogManager.getLogger(Main.class);
       /*
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/armydb", "Oleksii",                        "chess24")){
            ConnectionPool connectionPool = ConnectionPool.getInstance("jdbc:mysql://localhost:3306/armydb", "Oleksii",                   "chess24");
           LOGGER.info("Database connected, instance created");

        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
        }

        ArmoredWeapons armoredWeapons1 = new ArmoredWeapons(3L,20,200,20,"Monster",1);
        ArmoredWeapons armoredWeapons = new ArmoredWeapons(3L,15,110,20,"Monster",1);
        AirplaneDAO airplaneDAO = new AirplaneDAO();
        airplaneDAO.getAllAirplanes().forEach(LOGGER::info);
        ArmoredWeaponsDAO armoredWeaponsDAO = new ArmoredWeaponsDAO();
        armoredWeaponsDAO.getAllArmoredWeapons().forEach(LOGGER::info);
        armoredWeaponsDAO.addArmoredWeapons(armoredWeapons);
        armoredWeaponsDAO.updateArmoredWeapons(armoredWeapons1);
        armoredWeaponsDAO.deleteArmoredWeapons(3);
        */
        ArmoredPersonnelCarrierDAO armoredPersonnelCarrierDAO = new ArmoredPersonnelCarrierDAO();
        armoredPersonnelCarrierDAO.getArmoredPersonnelCarrierByArmament().forEach(LOGGER::info);
       List<Submarine> submarines = new SubmarineDAO().getAllSubmarines();
      //  Submarine submarine = new Submarine(4L,260,1);
        Jaxb jaxb = new Jaxb();
        for (Submarine submarine:submarines) {
            jaxb.jaxbToXML(submarine);
        }
        List<Airplane> airplane = new AirplaneDAO().getAllAirplanes();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("src/main/resources/ ObjToJSON.json"),airplane);

        List<Airplane> airplanesJSONToObj ;
        airplanesJSONToObj= objectMapper.readValue(new File("src/main/resources/ObjToJSON.json"),
                new TypeReference<List<Airplane>>(){});
        for(int i=0; i<airplanesJSONToObj.size();i++){
            LOGGER.info(airplanesJSONToObj.get(i).toString()+"\n");
        }
    }
}