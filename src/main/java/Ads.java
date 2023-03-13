import java.util.List;
import models.Ad;

public interface Ads{
    List<Ad> all();
    Ad findOne(long id);
    long insert(Ad ad);
    void update(Ad ad);
    void destroy(Ad ad);
}
