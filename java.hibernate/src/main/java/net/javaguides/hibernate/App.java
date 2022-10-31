package net.javaguides.hibernate;

import java.util.List;
import java.util.*;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.deleteStudent(1);
}
}