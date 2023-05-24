package com.tpe.repo;

import com.tpe.domain.Course;

public class CloudRepo implements Repo{
    @Override
    public void save(Course course) {
        System.out.println("------------------");

        System.out.println(course.getName() + "DERSİ BULUTA KAYDEDİLİYOR");
        System.out.println("------------------");

    }
}
