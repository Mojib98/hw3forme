import java.io.PrintStream;
import java.util.*;
public class System0 {
   // public static PrintStream out;
   // public static String in;
    //  public static PrintStream out;
    CourseList courseList = new CourseList();
    EmplyeeList emplyeeList = new EmplyeeList();
    ProfessorList professorList =new ProfessorList();
    StudentList studentList = new StudentList();
    Student student;
    Course course;
    Employee employee;
    Professor professor;


    public System0() {
        //course = new Course();

    }
    public void insertCourse(int id,String name,int unit,String professor,String factuly){
        course = new Course(id,name,unit,professor,factuly);
        courseList.add(course);
    }
    public void removeCourse(int id){
        courseList.remove(id);
    }
    public void insertemployee(String user,String pas,String name,String id,String date,String national){
        employee = new Employee(user,pas,name,id,date,national);
        emplyeeList.add(employee);
    }
    public void removeEmplyee(String id){
        emplyeeList.remove(id);
    }
    public void insertProfessor(String user,String pass,String name,String id,String date,String nationaCode,String status,String faculty){
        professor = new Professor(user,pass,name,id,date,nationaCode,status,faculty);
        professorList.add(professor);
    }
    public void removeProfessor(String id){
        professorList.remove(id);
    }
    public void insertStudent(String user,String password,String name,String id,String date,String nationaCode,String fac){
        student = new Student(user,password,name,id,date,nationaCode,fac);
    }
    public void remove(String id){
        studentList.remove(id);
    }
    public boolean isCheckEmployee(String user,String password){
        if (emplyeeList.set(user,password))
            return true;
        else
            return false;
    }
    public void showMyStudent(String fac){
        studentList.fac(fac);
    }
    public void insertScore(double score,String id){
        studentList.insertScore(score,id);
    }
    public boolean isCheckerStudent(String user,String password){
        if (studentList.set(user,password))
            return true;
        else
            return false;
    }
    public String idStudent(String user){
        String ids = studentList.getId(user);
        return ids;
    }
    public void showCourse(String id){
        studentList.showcorse(id);
    }
    public void showInfoStuden(String id){
        studentList.showInfo(id);
    }
    public boolean isCheckProfessor(String user,String password){
        return (professorList.set(user,password));
    }
    public void myFacultyCourse(String faculty){
        System.out.println(courseList.factulyId(faculty));
    }
    public String myFaculty(String id){
        String fa;
        fa = studentList.faculty(id);
        return fa;
    }
    public void selecrCourse(int id,String ids){
        Course course1=courseList.get1(id);
        studentList.insertCourse(ids,course1);
    }
    public String idProfessor(String user){
        String idp =" ";
      idp = professorList.idProfessor(user);
      return idp;
    }
    public void showInformationProfessor(String id){
        professorList.show(id);
    }
    public String facultyProfessor(String id){
       String s= professorList.faculty(id);
       return s;
    }




}
