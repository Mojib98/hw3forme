import java.util.Scanner;
import java.util.Random;

public class System1 {
    // EmplyeeList emplyeeList = new EmplyeeList();
    //ProfessorList professorList =new ProfessorList();
    //  StudentList studentList = new StudentList();
    // Scanner scanner;
    private String name;
    private String date;
    private String nationalCode;
    private String user;
    private String password;
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);
    private String id;
    private String user1;
    private String password1;
    private System0 system0 = new System0();

    public System1() {
        system0.insertemployee("admin", "admin", "majid", "admin", "admin", "admon");
    }

    //_____***********************************____________
    public void doIt() {
        while (true) {
            System.out.println("please insert user");
            user = scanner.next();
            System.out.println("please inser password");
            password = scanner.next();
            System.out.println();
            char type = user.charAt(0);
            if (search(user, password, type)) {
                if (type == 'E' || user.equals("admin")) {
                    empolyee(user, password);
                } else if (type == 'S') {
                    student(user);
                } else if (type == 'P') {

                } else
                    continue;
            }
        }
    }

    public void empolyee(String user, String password) {
        boolean isTrue = true;
        while (isTrue) {
            showEmployeeAction();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    giving();
                    id = "E";
                    id = id + (rand.nextInt(1000));
                    system0.insertemployee(this.user, this.password, this.name, id, this.date, this.nationalCode);
                    System.out.println("your employee add");
                    break;
                case 2:
                    System.out.println("plese insert id");
                    String idn = scanner.next();
                    system0.removeEmplyee(idn);
                    System.out.println("your Employee remove");
                    break;
                case 3:
                    giving();
                    System.out.println("please insert Status");
                    String status = scanner.next();
                    System.out.println("please insert faculty between math and computer");
                    String faculty = scanner.next();
                    id = "P";
                    id = id + (rand.nextInt(1000));
                    system0.insertProfessor(this.user, this.password, this.name, id, this.date, this.nationalCode, status, faculty);
                    break;
                case 4:
                    System.out.println("plese insert id");
                    String id = scanner.next();
                    system0.removeProfessor(id);
                    break;
                case 5:
                    giving();
                    id = "S";
                    id = id + (rand.nextInt(1000));
                    System.out.println("insert faculty between computer or math");
                    String fac = scanner.next();
                    system0.insertStudent(this.user, this.password, this.name, id, this.date, this.nationalCode, fac);
                    break;
                case 6:
                    System.out.println("insert id");
                    id = scanner.next();
                    system0.remove(id);
                    break;

                case 7:
                    System.out.println("plese insert your name");
                    this.name = scanner.next();
                    System.out.println("please insert unit");
                    int unit = scanner.nextInt();
                    System.out.println("please insert professor");
                    String pro = scanner.next();
                    System.out.println("please insert your faculty bitween math and computer");
                    String fc = scanner.next();
                    int ids = (rand.nextInt(1000));
                    system0.insertCourse(ids, this.name, unit, pro, fc);
                    break;

                case 8:
                    System.out.println("insert id course");
                    int ide = scanner.nextInt();
                    system0.removeCourse(ide);
                    break;
                case 9:
                    isTrue = false;


            }
        }


    }

    public void student(String user) {
        String ids = system0.idStudent(user);
        boolean isRun = true;
        String faculty = system0.myFaculty(id);
        int select;
        while (isRun) {
            System.out.println("for see your information insert 1");
            System.out.println("for select course insert 2");
            System.out.println("for see your course insert 3");
            System.out.println("please insert number ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    system0.showInfoStuden(ids);
                    break;
                case 2:
                    system0.myFacultyCourse(faculty);
                    int d  =scanner.nextInt();
                    system0.selecrCourse(d,ids);
                case 3:
                    system0.showCourse(ids);
                    break;


            }
        }

    }


    public void professor(String user) {
        String id = system0.idProfessor(user);
        String fc = system0.facultyProfessor(id);
        String select1;
        double score;
        boolean isused = true;
        int selection;
        while (isused){
            System.out.println("for see your info insert 1");
            System.out.println("for insert Score insert 2");
            System.out.println("for see your salary insert 3");
            System.out.println("for exit insert 4");
            selection = scanner.nextInt();
            switch (selection){
                case 1:
                    system0.showInformationProfessor(id);
                    break;
                case 2:
                    system0.showMyStudent(fc);
                    System.out.println("insert id of student");
                    select1 = scanner.next()
                    System.out.println();
                    System.out.println("please insert Score");
                    score=scanner.nextDouble();
                    system0.insertScore(score,select1);
                    break;
                case 3:




            }
        }


    }

    public boolean search(String user, String password, char e) {
        if (e == 'E') {
            if (system0.isCheckEmployee(user, password))
                return true;
            else
                return false;
        } else if (e == 'S') {
            if (system0.isCheckerStudent(user, password))
                return true;
            else
                return false;
        } else if (e == 'P') {
            if (system0.isCheckProfessor(user, password))
                return true;
            else
                return false;
        }
        return false;

    }

    public void showEmployeeAction() {
        System.out.println("for sing up Employee insert 1");
        System.out.println("for remove Employee insert 2");
        System.out.println("for sing up professor insert 3");
        System.out.println("for remove professor insert 4");
        System.out.println("for sing up Student insert 5");
        System.out.println("for remove Student insert 6");
        System.out.println("for add course insert 7");
        System.out.println("for remove course insert 8");
        System.out.println("exit 9");
        System.out.println("plese insert number");
    }

    public void giving() {
        System.out.println("please insert user");
        this.user = scanner.next();
        System.out.println("please insert password");
        this.password = scanner.next();
        System.out.println("please insert name");
        this.name = scanner.next();
        System.out.println("please insert date");
        this.date = scanner.next();
        System.out.println("please insert national code");
        this.nationalCode = scanner.next();
    }


}
