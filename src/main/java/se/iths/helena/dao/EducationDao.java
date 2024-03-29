package se.iths.helena.dao;

import se.iths.helena.entities.Education;

import java.util.List;
import java.util.Optional;

public interface EducationDao {
    void add(Education education);

    void update(Education education);

    void showInfo(Education education);

    Optional<Education> getById(int id);

    List<Education> getAll();

    void showAll();

    void delete(Education education);
}
