package array.controller;
import array.model.Array;
public class ArrayController 
{
	private String [] words = {"this","is","the","next","level","of","hipster","the","initialization","sequence"};
	private Array [] arrays;
	private int [] numbers;
	
	public ArrayController()
	{
		numbers = new int [20];
		
		arrays = new Array [5];
	}
	public void start()
	{
		for(int index = 0; index < arrays.length; index++)
		{
			arrays[index] = new Array("Array #" + index);
		}
		
		for(Array current : arrays)
		{
			System.out.println(current);
		}
	}
}
