package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Prodoct {
    private int id;
    private int pno;
    private String name;
    private String company;
    private int price;

    @Builder(builderMethodName = "builder")

    public Prodoct(int id, int pno, String name, String company, int price) {
        this.id = id;
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
