package task7;

import task7.Scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SchedulerTest {
	public static class Worker implements Runnable{
		private String s;
		
		public Worker(String s) {
			super();
			this.s = s;
		}
		
		@Override
		public void run() {
			System.out.println("Executed at "+(new Date())+": "+s);
		}
		
	}
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		var sch = new Scheduler();
		sch.start();
		System.out.println("Current time "+(new Date()));
		sch.scheduleRepeat(new Worker("repeat 2s"), 2000);
		sch.sсhedule(new Worker("delay"), 5000);
		SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date date = sdf.parse("28-05-2021 12:01:00");
		sch.sсhedule(new Worker("date"), date);
		
		
		Thread.sleep(300*1000);
		sch.stop();
	}

}
