package org.example.entities;

public class Course {
    private String name;
    private int price;
    private Category category;
    private Instructor instructor;

    public Course(String name, int price, String categoryName, String instructorName) {
        this.name = name;
        this.price = price;
        this.category = new Category();
        this.category.setName(categoryName);
        this.instructor = new Instructor();
        this.instructor.setName(instructorName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

}
