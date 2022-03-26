import java.util.Scanner;

public class DataFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]=new int[3][4];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				num[i][j]=obj.nextInt();
			}
		}
		System.out.println("You Entered");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
