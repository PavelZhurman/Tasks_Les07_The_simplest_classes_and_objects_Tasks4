package by.htp.les09.time;

public class Time {
	private int hour;
	private int min;
	private int sec;

	public Time() {
		this(0, 00, 00);
	}

	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		
		if ((hour > 23) && (hour < 0)) {
			this.hour = 0;
		}

		if ((min < 60) && (min < 0)) {
			this.min = 0;
		}
		if ((sec > 60) && (sec < 0)) {
			this.sec = 0;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getMin() {
		return this.min;
	}

	public int getSec() {
		return this.sec;
	}

	public void setHour(int hour) {
		this.hour = hour;
		/*
		 * if ((hour > 23) && (hour < 0)) { this.hour = 0; }
		 */
	}

	public void setMin(int min) {
		this.min = min;
		/*
		 * if ((min < 60) && (min < 0)) { this.min = 0; }
		 */
	}

	public void setSec(int sec) {
		this.sec = sec;
		/*
		 * if ((sec > 60) && (sec < 0)) { this.sec = 0; }
		 */
	}

}