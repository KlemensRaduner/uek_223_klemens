package ch.course223.helloworld.domainModels.bid;

import ch.course223.helloworld.domainModels.bid.dto.BidDTO;
import ch.course223.helloworld.domainModels.bid.dto.BidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bids")

public class BidController {

    private BidService bidService;

    private BidMapper bidMapper;

    @Autowired
    public BidController(BidService bidService, BidMapper bidMapper) {
        this.bidService = bidService;
        this.bidMapper = bidMapper;
    }

    // This endpoint retrieves all bid as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<BidDTO>> getAll() {
        return new ResponseEntity<>(bidMapper.toDTOs(bidService.findAll()), HttpStatus.OK);
    }

    // This endpoint retrieves a single bid by it's id
    @GetMapping("/{id}")
    public ResponseEntity<BidDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.findById(id)), HttpStatus.OK);
    }

    // This endpoint creates a new bid with the data given, currently this process is being mocked
    @PostMapping({"/", ""})
    public ResponseEntity<BidDTO> create(@RequestBody BidDTO bidDTO) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.create(bidMapper.fromDTO(bidDTO))), HttpStatus.CREATED);
    }

    // This endpoint updates an existing bid with the id and data given, currently this process is being mocked
    @PutMapping("/{id}")
    public ResponseEntity<BidDTO> updateById(@PathVariable String id, @RequestBody BidDTO bidDTO) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.updateById(id, bidMapper.fromDTO(bidDTO))), HttpStatus.OK);
    }

    // This endpoint deletes an existing bid with the id given, currently this process is being mocked
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        bidService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}