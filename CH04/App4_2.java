public class App4_2
{
	public static void main (String args[])
	{
		byte a = java.lang.Byte.MAX_VALUE;
		boolean b = false;
		System.out.println("a="+a+",取a的補數為~a="+(~a));
		System.out.println("b="+b+",NOT b 為!b="+(!b));
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_2.java

C:\j2sdk1.4.2_09\bin>java  App4_2
a=127,取a的補數為~a=-128
b=false,NOT b 為!b=true



*/