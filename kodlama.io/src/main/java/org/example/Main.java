package org.example;

import org.example.business.CourseManager;
import org.example.dataAccess.CourseDao;
import org.example.dataAccess.HibernateCourseDao;
import org.example.dataAccess.JdbcCourseDao;
import org.example.entities.Course;
import org.example.entities.Database;
import org.example.logging.FileLogger;
import org.example.logging.Logger;
import org.example.logging.MailLogger;

public class Main {
    public static void main(String[] args) {
        CourseDao courseDao1 = new HibernateCourseDao();
        CourseDao courseDao2 = new JdbcCourseDao();

        Logger logger1 = new FileLogger();
        Logger logger2 = new MailLogger();

        Database database = new Database();

        CourseManager courseManager1 = new CourseManager(courseDao1, logger1, database);
        CourseManager courseManager2 = new CourseManager(courseDao2, logger2, database);

        // Error cases
        //Course course1 = new Course(".NET", 10, "Software", "Halit Enes Kalayci");
        //Course course2 = new Course("Java", 5, "Programming", "Halit Enes Kalayci");
        //Course course3 = new Course("Java", -1, "Software", "Halit Enes Kalayci");

        Course course4 = new Course("Java", 10, "Backend", "Halit Enes Kalayci");
        Course course5 = new Course("JavaScript", 10, "Software", "Engin Demirog");

        courseManager1.add(course4);
        courseManager2.add(course5);
    }
}