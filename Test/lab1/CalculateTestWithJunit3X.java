package lab1;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculateTestWithJunit3X extends TestCase {
	//在junit3X中，所有的测试都要集成extends Testcase
	Calculate cal;
	
	public void setUp(){
		//每个测试方法在调用之前先要执行的方法，在Junit3X 中，必须以"setUp"命名
		cal =new Calculate();
		System.out.println("setUp");
	}
	
	public void tearDown(){
		System.out.println("tearDown");
	}
	
	public void testAdd(){
		//所有的测试方法都要以"test" 开头
//		Calculate cal=new Calculate();//构建对象
		int result=cal.add(20, 30);//输入参数
		Assert.assertEquals(50, result);//断言
		System.out.println("add");
	}
	
	public void testSub(){
		//所有的测试方法都要以"test" 开头
//		Calculate cal=new Calculate();//构建对象
		int result=cal.sub(20, 30);//输入参数
		Assert.assertEquals(-10, result);//断言
		System.out.println("sub");
	}
	
	public void testmul(){
		//所有的测试方法都要以"test" 开头
//		Calculate cal=new Calculate();//构建对象
		int result=cal.mul(20, 30);//输入参数
		Assert.assertEquals(600, result);//断言
		System.out.println("mul");
	}
	
	public void testdiv(){
		//所有的测试方法都要以"test" 开头
//		Calculate cal=new Calculate();//构建对象
		int result=cal.div(20, 30);//输入参数
		Assert.assertEquals(0, result);//断言
		System.out.println("div");
	}
//	public void TestAdd(){
//		//所有的测试方法都要以"test" 开头
//		
//	}
}
