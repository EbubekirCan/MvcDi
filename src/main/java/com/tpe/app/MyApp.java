package com.tpe.app;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.Repo;
import com.tpe.service.CourseService;
import com.tpe.service.MeetService;
import com.tpe.service.ZoomService;

public class MyApp {

    public static void main(String[] args) {

        Course course = new Course();
        course.setName("Adv Java");

        // dersin zoom ile anlatilmasini istiyorum.
//        ZoomService zoomService = new ZoomService();
//        zoomService.teachCourse(course);

        // dersin g.meet ile anlatilmasini istiyorum.
//        MeetService meetService = new MeetService();
//        meetService.teachCourse(course);

        // daha kolay bir bakim ve gelistirme icin interface
//        CourseService service = new MeetService();
//        service.teachCourse(course);

        // dersi buluta kaydetmek, locale kaydetmek istersem
        Repo repo = new CloudRepo();
        CourseService service2 = new ZoomService(repo);
        service2.teachCourse(course);
        service2.save(course);


    }
}
