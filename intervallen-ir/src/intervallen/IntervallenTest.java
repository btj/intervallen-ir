package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	class Interval {
		int ondergrens;
		int bovengrens;
	}
	
	int getOndergrens(Interval interval) { return interval.ondergrens; }
	
	int getBovengrens(Interval interval) { return interval.bovengrens; }
	
	void setOndergrens(Interval interval, int ondergrens) {
		interval.ondergrens = ondergrens;
	}
	
	void setBovengrens(Interval interval, int bovengrens) {
		interval.bovengrens = bovengrens;
	}

	@Test
	void test() {
		Interval myInterval = new Interval();
		setOndergrens(myInterval, 3);
		setBovengrens(myInterval, 7);
		int lengte = getBovengrens(myInterval) - getOndergrens(myInterval);
		assertEquals(4, lengte);
	}

}
