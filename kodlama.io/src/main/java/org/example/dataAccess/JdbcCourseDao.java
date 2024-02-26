package org.example.dataAccess;

import org.example.entities.Course;
import org.example.entities.Database;

public class JdbcCourseDao implements CourseDao{
    public void add(Course course, Database database)
    {
        database.setCourseNames(course.getName());
        database.setCategoryNames(course.getCategory().getName());
        database.setInstructorNames(course.getInstructor().getName());
        System.out.println(course.getName() + " added to Database with Jdbc");
    }
}
