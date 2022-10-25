package Select;

public class Course  {
    int id;
    String name;
    String place;
    String time;
    String teacher;
    public Course(String name, int id, String place, String time, String teacher) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.time = time;
        this.teacher = teacher;
    }
    public String toString(){
        return "科目:"+ name+ " 班课号:"+id+" 地点:"+place+" 上课时间:"+time+" 授课教师："+teacher;
    }
}