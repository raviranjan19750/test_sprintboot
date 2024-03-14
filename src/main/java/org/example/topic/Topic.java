package org.example.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Topic {
    @Id
    String id;
    String name;
    String description;


    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    /**
     * get field
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
