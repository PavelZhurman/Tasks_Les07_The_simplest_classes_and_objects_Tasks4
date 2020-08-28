package by.htp.les09.print;

import by.htp.les09.time.Time;

public class PrintTime {

		public void printTime (Time t) {
			System.out.println(t.getHour() + "." + t.getMin() + "." + t.getSec());
		}
}
