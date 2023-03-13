import models.Ad;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class  MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
//            String sql = "SELECT * FROM ads";
//            PreparedStatement stmt = connection.prepareStatement(sql);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("userId"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;
        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO ads (title, description, userId) VALUES ('%s', '%s', '%s')", ad.getTitle(), ad.getDescription(), ad.getUserId());
            long results = stmt.executeUpdate(sql);
            return results;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //    @Override
//    public void insert(Ad ad) {
//        String query = "USE ymir_alex INTO ads(id, userid, title, description) VALUES(ads.getId(), ad.getUserId(), ad.getTitle(), ad.getDescription())";
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

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
