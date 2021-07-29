import java.util.*;
public class Lucinda_jenkins_homework {
    public static void main(String[] args){
        System.out.println("请输入需要相加的数x：");

        Scanner reader=new Scanner(System.in);

        double x = reader.nextDouble();
        
        System.out.println("请输入需要相加的数y：");
        
        double y = reader.nextDouble();

        double sum = x + y;

        System.out.print("输入的和为："+sum);

    }
}
