



import java.io.*;
class Test
{
	
 synchronized void getFileData(String fname)
	{
		try
		{
		FileInputStream fin = new FileInputStream(fname);
			int c;
		System.out.println("File Read Start: " + fname);
			while((c=fin.read())!=-1)
			{
				 System.out.print((char)c);
			}		
			fin.close();
			System.out.println("File Read End: " + fname);
		}
		catch(Exception e)
		{
			System.out.println("Exception : " +e);
		}
	}
}

class ChildThread implements Runnable
{
	Test test;
	String fname;
	Thread t;
	ChildThread(String tname,String fname,Test test)
	{
		t = new Thread(this,tname);
		this.test = test;
		this.fname=fname;
		t.start();
	}
	public void run()
	{
		//synchronized(test)
		//{
test.getFileData(fname);
		//}
	}
}
class SynchDemo
{
	public static void main(String args[])
	{
		
		Test test = new Test();
		ChildThread c1 = new ChildThread("CSE","A.java",test);
		ChildThread c2 = new ChildThread("IT","B.java",test);
		
	}
}