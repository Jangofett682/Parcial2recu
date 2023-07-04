package RecuParcial2;

public class Tres
{
	public static void main(String[] args) 
	{
		
		int[] array = {1, 20,45, 5, 25, 66 , 70, 100, 15, 40, 99, 2};
		
		
		int max = 0;
		
		for(int arr: array)
		{
			if(arr>max)
			{
				max = arr;
				
			}
			
		}
		System.out.println("El mayor num es:" + max);
	}
}
