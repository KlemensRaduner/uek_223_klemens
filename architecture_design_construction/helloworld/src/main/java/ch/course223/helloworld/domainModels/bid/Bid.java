package ch.course223.helloworld.domainModels.bid;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bid")
public class Bid {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "id")
    private String id;

    @Column(name = "amount")
    private float amount;

    public Bid() {
    }

    public String getId() {
        return id;
    }

    public Bid setId(String id) {
        this.id = id;
        return this;
    }

    public float getAmount() {
        return amount;
    }

    public Bid setAmount(float amount) {
        this.amount = amount;
        return this;
    }
}