package ch.course223.helloworld.domainModels.auction.dto;

import ch.course223.helloworld.domainModels.article.Article;
import ch.course223.helloworld.domainModels.bid.Bid;

import java.util.List;

public class AuctionDTO {

    private int id;
    private String description;
    private float fixed_price;
    private float starting_price;
    private boolean is_public;
    private Article article;
    private List<Bid> bids;

    public AuctionDTO() {

    }

    public Article getArticle() {
        return article;
    }

    public AuctionDTO setArticle(Article article) {
        this.article = article;
        return this;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public AuctionDTO setBids(List<Bid> bids) {
        this.bids = bids;
        return this;
    }

    public int getId() {
        return id;
    }

    public AuctionDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AuctionDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getFixed_price() {
        return fixed_price;
    }

    public AuctionDTO setFixed_price(float fixed_price) {
        this.fixed_price = fixed_price;
        return this;
    }

    public float getStarting_price() {
        return starting_price;
    }

    public AuctionDTO setStarting_price(float starting_price) {
        this.starting_price = starting_price;
        return this;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public AuctionDTO setIs_public(boolean is_public) {
        this.is_public = is_public;
        return this;
    }
}
