package models;

import lombok.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Album implements Serializable {
    private long id;
    private String artist;
    private String albumName;
    private String releaseDate;
    private double sales;
    private String genre;
}
