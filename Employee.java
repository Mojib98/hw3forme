public class Employee extends Person {
    private String status;
   // private String salary;
    private String user;
    private String password;

    public Employee(String user,String password,String name, String id, String date, String nationalCode) {
        super(name, id, date, nationalCode);
      //  this.status = status;
       // this.salary = salary;
        this.user = user;
        this.password=password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public void setSalary(int salary) {
     //   this.salary = salary;
  //  }

    public String getStatus() {
        return status;
    }

  //  public int getSalary() {
 //       return salary;
 //   }

}
