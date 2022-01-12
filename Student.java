public class Student extends Person{
    String user;
    String password;
    private Course course;
    private String factuly;
    private double score;
    private CourseList courseList;
    int index = 0;
    private int units;
    public Student(String user,String password,String name, String id, String date, String nationalCode,String factuly) {
        super(name, id, date, nationalCode);
        this.factuly = factuly;
        this.user= user;
        this.password = password;
        //this.course = new Course[10];
        courseList = new CourseList();
        this.units=0;
    }


  /*  public void setCourseList(CourseList courseList) {
        this.courseList = courseList;
    }
    public void showFactulyCourse(){

    }*/

    public String getFactuly() {
        return factuly;
    }
    public void showMyInfo(){
        System.out.print(this.getName()+" ");
        System.out.print(getId());
        System.out.print(getFactuly());
        System.out.println(getDate());
        System.out.println(getNationalCode());
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    public void insertCourse(Course value){

    }
    public void showCourse(){
        courseList.showCourse();
    }
    public void selectCourse(Course v){
        courseList.add(v);
    }
}
