
import java.io.*;
public class SortArray
{	public static void main(String args[]) throws Exception
	{	int []num=new int[10];
		String str;
		int i, j,temp;					
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for (i=0;i<num.length;i++)
		{		
			System.out.print("Enter Number :");
			str=br.readLine();
			num[i]=Integer.parseInt(str);

		}
		}catch (IOException e)
		{	e.printStackTrace();
		}			

		System.out.println("Array Numbers are :");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}

		for(i=0;i<num.length;i++)
		{
			for(j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array as below:");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}

	}

}