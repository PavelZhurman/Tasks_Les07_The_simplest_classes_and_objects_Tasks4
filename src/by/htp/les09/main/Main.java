package by.htp.les09.main;

import by.htp.les09.print.PrintTime;

import by.htp.les09.logic.TimeLogic;
import by.htp.les09.time.Time;

public class Main {

	public static void main(String[] args) {

		Time t1 = new Time (25,24,55);
		PrintTime pr = new PrintTime();
		TimeLogic logic = new TimeLogic();

		pr.printTime(t1);
		t1=logic.timeUp(t1, 5, 10, 55);
		pr.printTime(t1);
		
		t1= logic.timeUp(t1, 10, 35, 11);
		pr.printTime(t1);
		
		t1 = logic.timeDown(t1, 6, 12, 11);
		pr.printTime(t1);
		
		
	}

}
