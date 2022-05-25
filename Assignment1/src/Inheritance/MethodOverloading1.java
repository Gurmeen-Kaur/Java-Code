package Inheritance;

public class MethodOverloading1
{
void show(int a, char b)
{
System.out.println("KING KONG");
}

void show(char a, int b)
{
System.out.println("JIM JAM");
}

public static void main(String[] args)
{
MethodOverloading1 m = new MethodOverloading1();
m.show(10,'A');
m.show('B', 10);
}
}
