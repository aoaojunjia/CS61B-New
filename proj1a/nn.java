
import java.util.*;
public class nn
{
	public static void main (String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个数X:");
		double x=reader.nextDouble();
		double y=0;
		if(x>0)
		{
			y=-1.0+3.0*x;
		}
		else if(x==0)
		{
			y=-1;
		}
		else if(x<0)
		{
			y=-1+2*x;
		}
		System.out.print(y);
	}
}