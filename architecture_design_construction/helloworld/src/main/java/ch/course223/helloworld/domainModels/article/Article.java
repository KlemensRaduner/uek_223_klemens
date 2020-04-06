package ch.course223.helloworld.domainModels.article;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name ="article")
public class Article {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "id")
    private  String id;

    @Column(name = "name")
    private  String name;

    @Column(name = "description")
    private  String description;

    @Column(name = "value")
    private float value;

    public Article(){}

    public String getId() {
        return id;
    }

    public Article setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Article setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Article setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getValue() {
        return value;
    }

    public Article setValue(float value) {
        this.value = value;
        return this;
    }
}
