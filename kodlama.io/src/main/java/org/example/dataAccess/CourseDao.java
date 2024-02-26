package org.example.dataAccess;

import org.example.entities.Course;
import org.example.entities.Database;

public interface CourseDao {
    public void add(Course course, Database database);
}
