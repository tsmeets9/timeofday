package timeofday;

import timeofday.TimeOfDayTest.TimeOfDay;

public class TimeOfDay {
	
	int minutesSinceMidnight;
	
	static int getHours(TimeOfDay t) { 
		return t.minutesSinceMidnight/60;
	}
	static int getMinutes(TimeOfDay t) {
		return t.minutesSinceMidnight%60;
	}
	static void setHours(TimeOfDay t, int hours) {
		t.minutesSinceMidnight = getMinutes(t) + hours * 60; ;
	}
	static void setMinutes(TimeOfDay t, int minutes) {
		t.minutesSinceMidnight = getHours(t)*60 + minutes;
	}
}
