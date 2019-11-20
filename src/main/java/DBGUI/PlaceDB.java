package DBGUI;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaceDB {

    private static final String DB_CONNECTION_URL = "jdbc:sqlite:places:sqlite";

    private static final String NAME_COL = "name";
    private static final String ELEV_COL = "elev";

    static final String OK = "ok";
    static final String Duplicate = "Duplicate place name";

    static final int SQLITE_DUPLICATE_PRIMARY_KEY_CODE = 19;

    PlaceDB(){
        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
            Statement statement = connection.createStatement()){

            String createTableSQL = "CREATE TABLE IF NOT EXISTS places (name TEXT PRIMARY KEY, elev DOUBLE)";
            statement.executeUpdate(createTableSQL);

        }catch (SQLException sqle){
            throw new RuntimeException(sqle);
        }
    }

    public List<Place> fetchAllRecords(){
        List<Place> allRecords = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        Statement statement = connection.createStatement()){

            String selectAllSQL = "SELECT * FROM places";
            ResultSet rsAll = statement.executeQuery(selectAllSQL);

            while (rsAll.next()){
                String name = rsAll.getString(NAME_COL);
                double elevation = rsAll.getDouble(ELEV_COL);
                Place placeRecord = new Place(name,elevation);
                allRecords.add(placeRecord);
            }

            return allRecords;

        }catch (SQLException sqle){
            throw new RuntimeException(sqle);
        }
    }

    public String addRecord (Place place){
        String addPlaceSQL = "INSERT INTO places VALUES (? , ?)";

        try(Connection connection = DriverManager.getConnection(DB_CONNECTION_URL);
        PreparedStatement preparedStatement = connection.prepareStatement(addPlaceSQL)){

            preparedStatement.setString(1,place.getName());
            preparedStatement.setDouble(2,place.getElevation());
            preparedStatement.execute();
            return OK;

        }catch (SQLException sqle){
            if (sqle.getErrorCode() == SQLITE_DUPLICATE_PRIMARY_KEY_CODE){
                return Duplicate;
            }else{
                throw new RuntimeException(sqle);
            }
        }
    }
}
