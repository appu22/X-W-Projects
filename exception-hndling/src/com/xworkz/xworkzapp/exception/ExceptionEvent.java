package com.xworkz.xworkzapp.exception;

public class ExceptionEvent {

	public ExceptionEvent() {
		System.out.println("ExceptionEvent object created ");
	}

	public void createEvent(boolean create) throws Throwable {
		if (create) {
			throw new Throwable("Throwable  event genrated");
		} else {
			System.out.println("Event not created");
		}
	}

	public void phase1() throws Throwable {
		System.out.println("phase1");
		this.phase2();
	}

	public void phase2() throws Throwable {
		System.out.println("phase2");
		this.phase3();
	}

	public void phase3() throws Throwable {
		System.out.println("phase3");
		this.phase4();
	}

	public void phase4() throws Throwable {
		System.out.println("phase4");
		this.phase5();
	}

	public void phase5() throws Throwable {
		System.out.println("phase5");
		this.createEvent(true);
		
	}

}
