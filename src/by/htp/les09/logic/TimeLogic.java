package by.htp.les09.logic;

import by.htp.les09.time.Time;

public class TimeLogic {

	public Time timeUp(Time t1, int newHour, int newMin, int newSec) {
		int hour;
		int min;
		int sec;

		hour = t1.getHour();
		min = t1.getMin();
		sec = t1.getSec();

		if ((newSec >= 60) && (newSec < 0)) {
			newSec = 0;
		}

		if ((newMin >= 60) && (newMin < 0)) {
			newMin = 0;
		}

		if ((newHour > 23) && (newHour < 0)) {
			newHour = 0;
		}

		sec += newSec;
		min += newMin;
		hour += newHour;

		if (sec >= 60) {
			min++;
			sec -= 60;

		}

		if (min >= 60) {
			hour++;
			min -= 60;
		}

		if (hour >= 24) {
			hour -= 24;
		}

		Time t = new Time(hour, min, sec);

		return t;
	}

	public Time timeDown(Time t1, int newHour, int newMin, int newSec) {
		int hour;
		int min;
		int sec;

		hour = t1.getHour();
		min = t1.getMin();
		sec = t1.getSec();

		if ((newSec >= 60) && (newSec < 0)) {
			newSec = 0;
		}

		if ((newMin >= 60) && (newMin < 0)) {
			newMin = 0;
		}

		if ((newHour > 23) && (newHour < 0)) {
			newHour = 0;
		}

		hour -= newHour;
		min -= newMin;
		sec -= newSec;

		if (sec < 0) {
			sec += 60;
			min--;
		}

		if (min < 0) {
			min += 60;
			hour--;
		}

		if (hour < 0) {
			hour += 24;
		}

		Time t = new Time(hour, min, sec);

		return t;
	}

}
