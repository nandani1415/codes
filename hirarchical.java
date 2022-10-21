import java. util.Scanner;
class family
{
private String gfn;
private String gmn;
Scanner kb= new Scanner(System.in);
void getFamily()
{
System.out.println("enter the name of grandfather:");
gfn=kb.nextLine();
System.out.println("enter the name of grandmother:");
gmn=kb.nextLine();
}
void putFamily()
{
System.out.println("Grandfather : " +gfn + "Grandmother :  " +gmn);
}}


class parents extends family
{
private String fn, mn;
void getparents()
{	
getFamily();
System.out.println("enter the name of father :");
fn=kb.nextLine();
System.out.println("enter the name of mother : ");
mn=kb.nextLine();
}
void putparents()
{
putFamily();
System.out.println("father : "+fn+ "mother :"+mn);
}}


class siblings extends family
{
private String s,b;
 public void getsiblings()
{ getFamily();
System.out.println("enter the name of sister :");
s=kb.nextLine();
System.out.println("enter the name od brother :");
b=kb.nextLine();
}
void putsiblings()
{
putFamily();
System.out.println("Sister :"+s+ "Brother : "+b);
}}


class hirarchical
{
public static void main(String args[])
{
	parents p1=new parents();
System.out.println("Parents:");
p1.getparents();
p1.putparents();
siblings s1=new siblings();
System.out.println("Siblings :");
s1.getsiblings();
s1.putsiblings();
}
}

