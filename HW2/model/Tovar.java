package Seminar_3.HW2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Tovar {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer sort;
}
