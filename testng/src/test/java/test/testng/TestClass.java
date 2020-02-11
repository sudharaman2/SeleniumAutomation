package test.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {

	@Parameters({ "hostname", "browser" })
	@Test
	public void method1(String hostname, @Optional String browsername) {
		System.out.println(hostname + " , " + browsername);
	}

	public void method2() {

	}

}
