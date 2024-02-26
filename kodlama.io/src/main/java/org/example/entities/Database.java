package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> courseNames;
    private List<String> categoryNames;
    private List<String> instructorNames;

    public Database() {
        this.courseNames = new ArrayList<>(List.of(".NET", "C#", "Python"));
        this.categoryNames = new ArrayList<>(List.of("Programming"));
        this.instructorNames = new ArrayList<>(List.of("Engin Demirog", "Halit Enes Kalayci"));
    }

    public List<String> getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(String courseName) {
        this.courseNames.add(courseName);
    }

    public List<String> getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(String categoryName) {
        this.categoryNames.add(categoryName);
    }

    public List<String> getInstructorNames() {
        return instructorNames;
    }

    public void setInstructorNames(String instructorName) {
        this.instructorNames.add(instructorName);
    }
}
