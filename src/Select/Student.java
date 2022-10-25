package Select;

public class Student extends People {
    String x;
    String d;
    String lesson;
    public Student(int id, String name, String sex,String lesson,String x,String d) {
        super(id, name, sex);
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.lesson=lesson;
        this.x=x;
        this.d=d;
    }

    public String toString() {
        return "编号：" + id + " 姓名：" + name + " 性别："+sex +" 课程："+lesson;
    }

    void xuanke() {
        if(x=="已选课");
        {
            System.out.println("这个学生已选课");
        }
    }

    void delete() {
        if (d=="退课") ;
        {
            System.out.println("学生退课");
        }
    }
}