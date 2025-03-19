package sanket;
import java.util.*;
public class VectorApplication
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.Add Element");
			System.out.println("2.View All");
			System.out.println("3.Count number of elemenet");
			System.out.println("4.Search element by contains method");
			System.out.println("5.Search element by index");
			System.out.println("6.Delete by using its index");
			System.out.println("7.Fetch elements by using get method");
			System.out.println("8.Sublist");
			System.out.println("9.Remove element by value");
			System.out.println("------------------------------------------------------------------");
		System.out.println("Enter choice");
		int choice =sc.nextInt();
		
			switch(choice)
			{
				case 1: System.out.println("Enter data in vector");
				int val=sc.nextInt();
				boolean b=v.add(val);
				if(b)
				{
					System.out.println("Element added");
				}
				else
				{
					System.out.println("Element not added");
				}
				break;
				case 2:
					Iterator i=v.iterator();
					while(i.hasNext())
					{
						Object obj=i.next();
						System.out.println(obj);
					}
			   break;
				case 3:
					System.out.println("Number of element in vector"+v.size());
				break;
				case 4:
					System.out.println("Enter value for search");
					val=sc.nextInt();
					b=v.contains(val);
							if(b)
							{
								System.out.println("Value Found");
							}
							else
							{
								System.out.println("Value not Found");
							}
							break;
				case 5:
					System.out.println("Enter value for search");
					val=sc.nextInt();
					int index=v.indexOf(val);
					if(index!=-1)
					{
						System.out.println("Data Found");
					}
					else
					{
						System.out.println("Data not found");
					}
					break;
				case 6:
					System.out.println("Enter value for delelte");
					val=sc.nextInt();
					index=v.indexOf(val);
					if(index!=-1)
					{
						Object obj=v.remove(index);
						System.out.println("Data Selete"+obj);
					}
					break;
				case 7:
					for(int k=0 ; k<v.size();k++)
					{
						Object obj=v.get(k);
						System.out.println(obj);
					}
					break;
				case 8:
					System.out.println("Enter start index and end index");
					int startindex=sc.nextInt();
					int endindex=sc.nextInt();
					if(startindex>=0 && endindex<v.size())
					{
						List list=v.subList(startindex,endindex);
						for(Object obj:list)
						{
							System.out.println(obj+"\t");
						}
					}
					break;
				case 9:
					System.out.println("Enter value for delete");
					val=sc.nextInt();
					v.remove((Object)val);
					break;
				case 10 :
					System.exit(0);
					break;
					default:
						System.out.println("Invalid Choice");
			}
		}while(true);
		
	}

}
