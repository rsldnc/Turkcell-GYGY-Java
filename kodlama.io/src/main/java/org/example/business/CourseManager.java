package org.example.business;

import org.example.dataAccess.CourseDao;
import org.example.entities.Course;
import org.example.entities.Database;
import org.example.logging.Logger;

public class CourseManager {
    private CourseDao courseDao;
    private Logger logger;
    private Database database;
    public CourseManager(CourseDao courseDao, Logger logger, Database database) {
        this.courseDao = courseDao;
        this.logger = logger;
        this.database = database;
    }

    public void add(Course course)
    {
        if (database.getCourseNames().contains(course.getName()))
            System.out.println("The course name cannot be repeated");
        else if (database.getCategoryNames().contains(course.getCategory().getName()))
            System.out.println("The category name cannot be repeated");
        else if (course.getPrice() < 0)
            System.out.println("The price of a course cannot be less than 0");
        else
        {
            courseDao.add(course, database);
            logger.log(course.getName());
        }
    }

}
