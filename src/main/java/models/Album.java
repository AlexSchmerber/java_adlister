package models;

import lombok.*;

import java.beans.JavaBean;
import java.io.Serializable;

@JavaBean
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
