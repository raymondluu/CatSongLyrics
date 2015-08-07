/*************************
* File Name: CatSongLyrics.java
* Coder Name: Raymond Luu
* Assignment: 1
***************************/
public class CatSongLyrics
{
	public static void main(String[] args)
	{
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
	}
	//first verse
	public static void verse1()
	{
		System.out.println("Bought me a cat and the cat pleased me,");
		System.out.println("I fed my cat under yonder tree.");
		catLine();
	}
	//second verse
	public static void verse2()
	{
		System.out.println("Bought me a hen and the hen pleased me,");
		System.out.println("I fed my hen under yonder tree.");
		henLine();
	}
	
	//third verse
	public static void verse3()
	{
		System.out.println("Bought me a duck and the duck pleased me,");
		System.out.println("I fed my duck under yonder tree.");
		duckLine();
	}
	//fourth verse
	public static void verse4()
	{
		System.out.println("Bought me a goose and the goose pleased me,");
		System.out.println("I fed my goose under yonder tree.");
		gooseLine();
	}
	//fifth verse
	public static void verse5()
	{
		System.out.println("Bought me a sheep and the sheep pleased me,");
		System.out.println("I fed my sheep under yonder tree.");
		sheepLine();
	}
	//cat line
	public static void catLine()
	{
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
	}
	//hen line
	public static void henLine()
	{
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
		catLine();
	}
	//duck line
	public static void duckLine()
	{
		System.out.println("Duck goes quack, quack,");
		henLine();
	}
	//goose line
	public static void gooseLine()
	{
		System.out.println("Goose goes hissy, hissy,");
		duckLine();
	}
	//sheep line
	public static void sheepLine()
	{
		System.out.println("Sheep goes baa, baa,");
		gooseLine();
	}
}