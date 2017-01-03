package lab1;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculateTestWithJunit3X extends TestCase {
	//��junit3X�У����еĲ��Զ�Ҫ����extends Testcase
	Calculate cal;
	
	public void setUp(){
		//ÿ�����Է����ڵ���֮ǰ��Ҫִ�еķ�������Junit3X �У�������"setUp"����
		cal =new Calculate();
		System.out.println("setUp");
	}
	
	public void tearDown(){
		System.out.println("tearDown");
	}
	
	public void testAdd(){
		//���еĲ��Է�����Ҫ��"test" ��ͷ
//		Calculate cal=new Calculate();//��������
		int result=cal.add(20, 30);//�������
		Assert.assertEquals(50, result);//����
		System.out.println("add");
	}
	
	public void testSub(){
		//���еĲ��Է�����Ҫ��"test" ��ͷ
//		Calculate cal=new Calculate();//��������
		int result=cal.sub(20, 30);//�������
		Assert.assertEquals(-10, result);//����
		System.out.println("sub");
	}
	
	public void testmul(){
		//���еĲ��Է�����Ҫ��"test" ��ͷ
//		Calculate cal=new Calculate();//��������
		int result=cal.mul(20, 30);//�������
		Assert.assertEquals(600, result);//����
		System.out.println("mul");
	}
	
	public void testdiv(){
		//���еĲ��Է�����Ҫ��"test" ��ͷ
//		Calculate cal=new Calculate();//��������
		int result=cal.div(20, 30);//�������
		Assert.assertEquals(0, result);//����
		System.out.println("div");
	}
//	public void TestAdd(){
//		//���еĲ��Է�����Ҫ��"test" ��ͷ
//		
//	}
}
