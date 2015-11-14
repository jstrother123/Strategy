package edu.softeng.strategy.robot;

import edu.softeng.strategy.robot.interfaces.BehaviorInterface;
import edu.softeng.strategy.robot.strategies.NormalBehavior;

public class Robot {
	public void move() {
		System.out.printf("%s: Based on current position the behavior object chose the next move:%n", this.name);
		System.out.printf("\tThe result returned by behaviour object is sent to the movement mechanisms for the robot '%s'%n", this.name);

		switch(this.behavior.moveCommand()) {
			case 1:
				System.out.println("\tMove forward");
				break;
			case -1:
				System.out.println("\tMove backward");
				break;
			case 0:
				System.out.println("\tStay put");
				break;
		}
	}

	private BehaviorInterface behavior;
	public BehaviorInterface getBehavior() {
		return this.behavior;
	}
	public Robot setBehavior(BehaviorInterface behavior) {
		this.behavior = behavior;
		return this;
	}
	
	private String name;
	public String getName() {
		return this.name;
	}
	
	public Robot(String name) {
		this.name = name;
		this.behavior = new NormalBehavior();
	}
}
