import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
class MicrowaveTester {
	@Before
	public void setUp()
	{
	microwave = new Microwave();
	}
	@Test
	public void increaseTime1()
	{
	microwave.increaseTime1();
	microwave.start();
	assertEquals("Time Button was pressed. Time is 30 seconds", outStream.toString().trim());
	}
	@Test
	public void increaseTime2()
	{
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.start();
	assertEquals("Time Button was pressed. Time is 60 seconds", outStream.toString().trim());
	}
	@Test
	public void switchPower1()
	{
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.switchPower();
	microwave.start();
	assertEquals("Power Button was pressed. Power level is 2", outStream.toString().trim());
	}
	@Test
	public void switchPower2()
	{
	microwave.switchPower();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.switchPower();
	microwave.start();
	assertEquals("Cooking for 60 seconds at level 2.", outStream.toString().trim());
	}
	@Test
	public void testReset()
	{
	microwave.switchPower();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.increaseTime();
	microwave.switchPower();
	microwave.reset();
	microwave.start();
	assertEquals("Reset Button was pressed. Power level is 1. Time is 0 seconds. ", outStream.toString().trim());
	}
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
