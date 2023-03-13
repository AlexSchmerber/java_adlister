package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;

    public Ad(long id, long userId, String title, String description) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
    }
}
