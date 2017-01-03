package lab1;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTestWithJunit4X {

	Calculate cal;

	@BeforeClass
	public static void init(){
		System.out.println("@@BeforeClass");
	}
	
	@AfterClass
	public static void  destory(){
		System.out.println("@@AfterClass");
	}
	
	@Before
	public void setUp(){
		cal =new Calculate();
		System.out.println("@Before");
	}
	
	@After
	public void tearDown(){
		System.out.println("@After");

	}
	
	@Test
	public void addTest(){
//		Calculate cal=new Calculate();//构建对象
		int result=cal.add(20, 30);//输入参数
		Assert.assertEquals(50, result);//断言
		System.out.println("add");
	}
	
	@Test
	public void testSub(){
//		Calculate cal=new Calculate();//构建对象
		int result=cal.sub(20, 30);//输入参数
		Assert.assertEquals(-10, result);//断言
		System.out.println("sub");
	}
	
	@Test
	public void testmul(){
//		Calculate cal=new Calculate();//构建对象
		int result=cal.mul(20, 30);//输入参数
		Assert.assertEquals(600, result);//断言
		System.out.println("mul");
	}
	
	@Test
	public void testdiv(){
//		Calculate cal=new Calculate();//构建对象
		int result=cal.div(20, 30);//输入参数
		Assert.assertEquals(0, result);//断言
		System.out.println("div");
	}
}
