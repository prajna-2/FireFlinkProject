package javaprogrames;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int rowSize=sc.nextInt();
		System.out.println("enter column size");
		int colSize=sc.nextInt();
		int a[][]=new int[rowSize][colSize];
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<colSize;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<colSize;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
