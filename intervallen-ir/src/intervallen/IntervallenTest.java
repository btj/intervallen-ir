package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	

	@Test
	void test() {
		Interval myInterval = new Interval(3, 7);
		int lengte = myInterval.getBovengrens() - myInterval.getOndergrens();
		assertEquals(4, lengte);
		
		myInterval.setOndergrens(2);
		assertEquals(2, myInterval.getOndergrens());
		assertEquals(6, myInterval.getBovengrens());
		assertEquals(4, myInterval.getLengte());
		
		myInterval.setBovengrens(8);
		assertEquals(2, myInterval.getOndergrens());
		assertEquals(8, myInterval.getBovengrens());
		assertEquals(6, myInterval.getLengte());
	}

}
