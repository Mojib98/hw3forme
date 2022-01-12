public class CourseList {
    private Course[] list;
    private int emptyHomeIndex;

    public CourseList() {
        list = new Course[20];
        emptyHomeIndex = 0;
    }

    public void add(Course value) {
        list[emptyHomeIndex] = value;
        emptyHomeIndex++;
    }

    public Course get1(int index) {
        return list[index];
    }

    public Course get(int id) {
        for (Course c: list) {
            if (id==c.getId())
                return c;
        }
        return null;
    }
    public int search(int id){
        for (int i =0;i<emptyHomeIndex-1;i++){
            if(id == list[i].getId())
                return i;
        }
        return -1;

    }


    public void remove(int id){
        int index = search(id);
        for (int ind=index;ind<this.emptyHomeIndex-1;ind++)
            list[ind]=list[ind+1];
        list[emptyHomeIndex-1]=null;
        this.emptyHomeIndex--;
    }
    public Course factulyId(String facul){
        for (Course c: list) {
            if (facul.equals(c.getFactuly()))
                return c;
        }
        return null;
    }

    public Course[] getList() {
        return list;
    }
    public String fc(int i){
        return list[i].getFactuly();
    }
    public void showCourse(){
        for (Course c: list
             ) {
            c.myCourseInfo();
        }
    }
    public Course getc(int id){
        int ind=search(id);
        return list[ind];
    }
}
