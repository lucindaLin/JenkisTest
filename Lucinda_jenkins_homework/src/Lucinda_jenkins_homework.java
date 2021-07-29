import java.util.*;
public class Lucinda_jenkins_homework {
    public static void main(String[] args){
        System.out.println("请输入需要相加的数，任意字母结束输入：");

        Scanner reader=new Scanner(System.in);

        double sum = 0;

        int m=0;

        while(reader.hasNextDouble())

        {
            double x = reader.nextDouble();

            m = m + 1;

            sum = sum + x;

        }

        System.out.print("输入的个数"+m+"\t和为："+sum);

        //System.out.print("\t平均值为："+sum/m);

    }
}
