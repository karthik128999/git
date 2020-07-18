package git;
class Dimensions
{
	int x;
	Dimensions(int x)
	{
		this.x=x;
	}
	int squarearea(int x)
	{
		return x*x;
	}
}
public class Basics {
public static void main(String[] args) {
	Dimensions d=new Dimensions(3);
	System.out.println(d.squarearea(3));
}
}
