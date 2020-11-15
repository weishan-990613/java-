package pack03;

public class DC implements Studentman,teacherman {
    String name;
    String sex;
    int age;
    double tuition;
    double salary;
    double sq_salary;     //税前工资
    static double sh_salary;     //税后工资

    public DC (String name,String sex,int age,double tuition,double salary){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tuition = tuition;
        this.salary = salary;
    }
    public double getTuition(){

        return tuition;
    }
    public void setTuition(double t){

        this.tuition = t;
        System.out.println("查询学费： " + t + "元");
    }
    public double getSalary(){

        return salary;
    }
    public void setSalary(double s){

        this.salary = s;
        System.out.println("发放工资： " + s + "元");
    }
    public double tongji(){
//        System.out.println(salary * 12 - tuition * 2);
        sq_salary = salary * 12 - tuition * 2;
        return sq_salary;
    }
    public static double jiaoshui(double sq_salary){
        DC.sh_salary = sq_salary - (sq_salary - 5000) * 0.03;
        return sh_salary;
    }
}
