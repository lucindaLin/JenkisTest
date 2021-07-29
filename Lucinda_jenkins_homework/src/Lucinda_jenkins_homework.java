import java.util.*;
public class Lucinda_jenkins_homework {
    public static void main(String[] args){
        System.out.println("请输入需要相加的数x：");

        Scanner reader=new Scanner(System.in);

        double x = reader.nextDouble();
        System.out.println("请输入需要相加的数x：");
        double y = reader.nextDouble();

        double sum = 0;

        sum = x + y;

        System.out.print("输入的和为："+sum);

        /*int m=0;

        while(reader.hasNextDouble())

        {
            double x = reader.nextDouble();

            m = m + 1;

            sum = sum + x;

        }

        System.out.print("输入的个数"+m+"\t和为："+sum);*/

        //System.out.print("\t平均值为："+sum/m);

    }
}
