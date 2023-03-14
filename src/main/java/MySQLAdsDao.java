import models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class  MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            System.out.println("error in MySQLAdsDao Config");
        }

    }
    @Override
    public List<Ad> all() {
        try {
//            String sql = "SELECT * FROM ads";
//            PreparedStatement stmt = connection.prepareStatement(sql);
            List<Ad> adsList = new ArrayList<>();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ymir_alex.ads");
            while (rs.next()) {
                adsList.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return adsList;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public long insert(Ad ad) {
        long results = 0;
        try {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO ads (title, description, userId) VALUES ('%s', '%s', '%s')", ad.getTitle(), ad.getDescription(), ad.getUserId());
            results = stmt.executeUpdate(sql);
            return results;
        } catch (SQLException e) {
            System.out.println("error in insert");
        }
        return results;
    }

    @Override
    public Ad findOne(long id) {
        return null;
    }
    @Override
    public void update(Ad ad) {

    }
    @Override
    public void destroy(Ad ad) {

    }
}
