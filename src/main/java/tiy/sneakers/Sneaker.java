package tiy.sneakers;

import javax.persistence.*;

@Entity
@Table(name = "sneakers")
public class Sneaker {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String model;

    @Column(nullable = false)
    int modelNo;

    @Column(nullable = false)
    String color;


    @Column(nullable = false)
    int releaseYear;

    @Column(nullable = false)
    double  price;

    @Column(nullable = false)
    String  photoLink;

    public Sneaker() {
    }

    public Sneaker(String model, int modelNo, String color, int releaseYear,double price,String photoLink) {
        this.model = model;
        this.modelNo = modelNo;
        this.color= color;
        this.releaseYear = releaseYear;
        this.price=price;
        this.photoLink = photoLink;
    }
}

