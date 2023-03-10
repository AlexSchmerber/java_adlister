package models;

import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Quote implements Serializable {
    private Author author;
    private String content;
}
