package org.bach.common.lombok;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.NonNull;
import lombok.val;
import lombok.var;

public class LombokTest {

	public void test(@NonNull String param) {
		System.out.println(param);
	}
	
	public static void main(String[] args) {

		var example = new ArrayList<String>();

		example.add("Hello");

		System.out.println(example.get(0));

		val ex2 = new HashMap<String, String>();
		ex2.put("test", "test");

		for (val e : ex2.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
		var test = new String("123");
		System.out.println(test);
	
		LombokTest test2 = new LombokTest();
		test2.test("test");
		
		BeanTest beanTest = new BeanTest();
		beanTest.setName("name");
		beanTest.setValue("value");
		System.out.println(beanTest);
	}

}
