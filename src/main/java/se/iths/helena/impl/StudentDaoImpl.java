package se.iths.helena.impl;

import se.iths.helena.dao.StudentDao;
import se.iths.helena.entities.Student;

public class StudentDaoImpl extends DaoImpl implements StudentDao  {

    public StudentDaoImpl(){
        super();
    }

    @Override
    public void add(Student student) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(student);
        getEntityManager().getTransaction().commit();
    }

    @Override
    public void update(Student student) {
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(student);
        getEntityManager().getTransaction().commit();
    }

    @Override
    public void showInfo(Student student) {
        student.print();
    }

    @Override
    public Student getById(int id) {
        return getEntityManager().find(Student.class, id);
    }

    @Override
    public void showAll() {
        getEntityManager().createQuery("SELECT s FROM Student s", Student.class).getResultList().forEach(Student::print);
    }

    @Override
    public void delete(Student student) {
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(student);
        getEntityManager().getTransaction().commit();
    }
}
