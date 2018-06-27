package com.theButton;

public class Button implements Pushable {
	private int speed;
	private int distance;
	private int time;

	/*
	 * speed = distance/time
	 */

	public Button() {
		super();
	}

	@Override
	public void push() {
		System.out.println(toString());
		
	}
	
	public Button(int distance, int time) {
		super();
		
		this.distance = distance;
		this.time = time;
	}

	

	public double getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		speed = (int) (distance/time);
		return "Button [speed=" + speed + ", distance=" + distance + ", time=" + time + "]";
	}

	

}
