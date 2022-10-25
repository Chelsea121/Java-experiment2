package Select;

public class Test {
    public static void main(String[] args){
        Student me = new Student(2021666000, "快快学生", "女", "快乐的课","已选课","选课");
        System.out.println("学生信息");
        System.out.println(me);
        Teacher z  = new Teacher(2021666666,"乐乐老师","女","快乐的课");
        System.out.println("教师信息");
        System.out.println(z);
        Course v = new Course("快乐的课",606,"教学楼606","14:50","乐乐老师");
        System.out.println("课程信息");
        System.out.println(v);
        me.xuanke();


    }
}