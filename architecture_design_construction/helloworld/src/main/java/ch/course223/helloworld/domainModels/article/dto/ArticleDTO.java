package ch.course223.helloworld.domainModels.article.dto;

import ch.course223.helloworld.domainModels.article.Article;

public class ArticleDTO {

    private String id;
    private String name;
    private String description;
    private float value;

    public ArticleDTO() {
    }

    public String getId() {
        return id;
    }

    public ArticleDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ArticleDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ArticleDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getValue() {
        return value;
    }

    public ArticleDTO setValue(float value) {
        this.value = value;
        return this;
    }
}
