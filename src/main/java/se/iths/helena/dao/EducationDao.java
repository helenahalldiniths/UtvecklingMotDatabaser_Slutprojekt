package se.iths.helena.dao;

import se.iths.helena.entities.Education;

public interface EducationDao {
    void add(Education education);

    void update(Education education);

    void showInfo(Education education);

    Education getById(int id);

    void showAll();

    void delete(Education education);
}
