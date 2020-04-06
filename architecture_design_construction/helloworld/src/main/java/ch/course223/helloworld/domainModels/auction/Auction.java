package ch.course223.helloworld.domainModels.auction;

import ch.course223.helloworld.domainModels.article.Article;
import ch.course223.helloworld.domainModels.bid.Bid;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @Column(name = "fixed_price")
    private float fixed_price;

    @Column(name = "starting_price")
    private float starting_price;

    @Column(name = "is_public")
    private boolean is_public;

    @ManyToOne
    @JoinColumn(name = "article", referencedColumnName = "id")
    private Article article;

    @ManyToMany
    @JoinTable(
            name = "auction_bid",
            joinColumns = @JoinColumn(name = "auction_id"),
            inverseJoinColumns = @JoinColumn(name = "bid_id")
    )
    private Set<Bid> bids;

    public Auction(){

    }

    public Article getArticle() {
        return article;
    }

    public Auction setArticle(Article article) {
        this.article = article;
        return this;
    }

    public Set<Bid> getBids() {
        return bids;
    }

    public Auction setBids(Set<Bid> bids) {
        this.bids = bids;
        return this;
    }

    public String getId() {
        return id;
    }

    public Auction setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Auction setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getFixed_price() {
        return fixed_price;
    }

    public Auction setFixed_price(float fixed_price) {
        this.fixed_price = fixed_price;
        return this;
    }

    public float getStarting_price() {
        return starting_price;
    }

    public Auction setStarting_price(float starting_price) {
        this.starting_price = starting_price;
        return this;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public Auction setIs_public(boolean is_public) {
        this.is_public = is_public;
        return this;
    }
}
