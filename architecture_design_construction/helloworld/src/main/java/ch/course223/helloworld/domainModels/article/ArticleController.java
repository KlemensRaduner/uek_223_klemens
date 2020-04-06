package ch.course223.helloworld.domainModels.article;

import ch.course223.helloworld.domainModels.article.dto.ArticleMapper;
import ch.course223.helloworld.domainModels.article.dto.ArticleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/articles")

public class ArticleController {

    private ArticleService articleService;

    private ArticleMapper articleMapper;

    @Autowired
    public ArticleController(ArticleService articleService, ArticleMapper articleMapper) {
        this.articleService = articleService;
        this.articleMapper = articleMapper;
    }

    // This endpoint retrieves all article as a list
    @GetMapping({"/", ""})
    public ResponseEntity<List<ArticleDTO>> getAll() {
        return new ResponseEntity<>(articleMapper.toDTOs(articleService.findAll()), HttpStatus.OK);
    }

    // This endpoint retrieves a single article by it's id
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(articleMapper.toDTO(articleService.findById(id)), HttpStatus.OK);
    }

    // This endpoint creates a new article with the data given, currently this process is being mocked
    @PostMapping({"/", ""})
    public ResponseEntity<ArticleDTO> create(@RequestBody ArticleDTO articleDTO) {
        return new ResponseEntity<>(articleMapper.toDTO(articleService.create(articleMapper.fromDTO(articleDTO))), HttpStatus.CREATED);
    }

    // This endpoint updates an existing article with the id and data given, currently this process is being mocked
    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateById(@PathVariable String id, @RequestBody ArticleDTO articleDTO) {
        return new ResponseEntity<>(articleMapper.toDTO(articleService.updateById(id, articleMapper.fromDTO(articleDTO))), HttpStatus.OK);
    }

    // This endpoint deletes an existing article with the id given, currently this process is being mocked
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        articleService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}