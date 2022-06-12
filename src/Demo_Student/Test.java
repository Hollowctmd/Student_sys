package Demo_Student;

 class TestStudent {
    private String name;
    private float scores;
    public TestStudent(){

    }
    public TestStudent(String name,float scores) {  //构造方法
        this.name = name;
        this.scores = scores;
    }
    public void setName(String name){
        this.name = name;
    }

     public String getName() {
         return name;
     }  //获取

     public void setScores(float scores) {
         this.scores = scores;
     }
     public float getScores() { //获取
         return scores;
     }
     public void show(){
        System.out.println("我是"+getName ()+"成绩为："+getScores());
     }
 }
public class Test{
     public static void main(String[] args) {
        TestStudent std1 = new TestStudent();       //构造方法对象
        std1.setName("李四");
        std1.setScores (98);

        TestStudent std2 = new TestStudent("张三",59);
        std1.show ();
        std2.show ();
     }
}