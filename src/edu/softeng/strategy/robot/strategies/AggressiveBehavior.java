package edu.softeng.strategy.robot.strategies;

import edu.softeng.strategy.robot.interfaces.BehaviorInterface;

public class AggressiveBehavior implements BehaviorInterface {
	@Override
	public int moveCommand() {
		System.out.println("\tAgressive Behavior: if find another robot attack it");
		return 1;
	}
}
