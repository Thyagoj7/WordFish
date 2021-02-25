package com.mundopeixe.mundopeixe.model;

import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="fish")
public class WordFish {

    private long id;
    private String name;
    private String scientific_name;
    private String family;
    private String source;
    private float ph;
    private float size;
    private int life_expectancy;
    private String food;
    private String description;

    public WordFish(){

    }

    public WordFish(long id, String name, String scientific_name, String family, String source, float ph, float size, int life_expectancy,String food, String description){
        this.id=id;
        this.name=name;
        this.scientific_name=scientific_name;
        this.family=family;
        this.source=source;
        this.ph=ph;
        this.size=size;
        this.life_expectancy=life_expectancy;
        this.food=food;
        this.description=description;

    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name="name" , nullable=false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="scientific_name" , nullable=false)
    public String getScientific_name() {
        return scientific_name;
    }
    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    @Column(name="family" , nullable=false)
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

    @Column(name="source" , nullable=false)
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    @Column(name="ph" , nullable=false)
    public float getPh() {
        return ph;
    }
    public void setPh(float ph) {
        this.ph = ph;
    }

    @Column(name="size" , nullable=false)
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }

    @Column(name="life_expectancy" , nullable=false)
    public int getLife_expectancy() {
        return life_expectancy;
    }
    public void setLife_expectancy(int life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    @Column(name="food" , nullable=false)
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    @Column(name="description" , nullable=false)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "WordFish [id="+id+",name="+name+",scientific_name="+scientific_name+",family="+family+",source="+source+",ph="+ph+",size="+size+",life_expectancy="+life_expectancy+",food="+food+",description="+description+"]";
    }
}
