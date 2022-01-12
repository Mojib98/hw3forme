public class StudentList {
    private Student[] list;
    private int emptyHomeIndex;

    public StudentList() {
        list = new Student[20];
        emptyHomeIndex = 0;
    }

    public void add(Student value) {
        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }

    /* public Student get(int index) {
         return list[index];
     }
 */
    public Student get(String id) {
        for (Student c: list) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public Boolean isEmpty() {
        return emptyHomeIndex == 0;
    }

    public int size() {
        return emptyHomeIndex;
    }
    public int search(String id){
        for (int i = 0;i<emptyHomeIndex-1;i++){
            String temp = list[i].getId();
            if(id .equals( temp)){
                return i;
            }
        }
        return -1;
    }

    public void remove(String id){
        int sigh=search(id);
        for (int ind=sigh;ind<this.emptyHomeIndex-1;ind++)
            list[ind]=list[ind+1];
        list[emptyHomeIndex-1]=null;
        this.emptyHomeIndex--;
    }
    public  void change(String id,String name){
        int index =  search( id);
        list[index].setName(name);

    }
    public void fac(String fc){
        for (Student s:list
             ) {
            if(s.getFactuly().equals(fc)){
                s.showMyInfo();
            }

        }
    }
    public void insertScore(double score,String id){
        int index = search(id);
        list[index].setScore(score);
    }
 //   public void showProfessor(String id){

  //  }
  public  boolean set(String user,String passwor){
      for (Student c :list){
          if((c.getUser().equals(user)) && (c.getPassword().equals(passwor))){
              return true;
          }
      }
      return false;
  }
    public String getId (String user){
        for (Student c :list){
            if((c.getUser().equals(user))){
                return c.getId();
            }
        }
        return " ";
    }
    public void showcorse(String id){
        int in=search(id);
        list[in].showCourse();
    }
    public void showInfo(String id){
        int n =search(id);
        list[n].showMyInfo();
    }
    public String faculty(String id){
        String f = " ";
        for (Student s:list
             ) {
            if(id.equals(s.getId())){
              f =  s.getFactuly();
            }

        }
        return f;

    }
    public void insertCourse(String ids,Course c){
        int index = search(ids);
        list[index].selectCourse(c);
    }


}

