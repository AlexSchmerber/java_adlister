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
public class Quote implements Serializable {
    private String author;
    private String content;
}
