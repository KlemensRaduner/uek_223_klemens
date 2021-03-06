package ch.course223.helloworld.domainModels.auction;


import java.util.List;

public interface AuctionService {

    Auction create(Auction auction);

    List<Auction> findAll();

    Auction findById(String id);

    Auction updateById(String id, Auction auction);

    void deleteById(String id);

}
