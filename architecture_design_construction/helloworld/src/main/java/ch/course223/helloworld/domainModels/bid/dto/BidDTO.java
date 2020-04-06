package ch.course223.helloworld.domainModels.bid.dto;

public class BidDTO {


    private String id;

    private float amount;

    public BidDTO() {
    }

    public String getId() {
        return id;
    }

    public BidDTO setId(String id) {
        this.id = id;
        return this;
    }

    public float getAmount() {
        return amount;
    }

    public BidDTO setAmount(float amount) {
        this.amount = amount;
        return this;
    }
}
