package Select;

public class Teacher extends People{
    String lesson;
    public Teacher(int id,String name,String sex,String lesson){
        super(id,name,sex);
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.lesson=lesson;
    }
    public String toString(){
        return"编号：" + id+" 姓名："+name +" 性别："+sex+" 课程:"+lesson;
    }
}
