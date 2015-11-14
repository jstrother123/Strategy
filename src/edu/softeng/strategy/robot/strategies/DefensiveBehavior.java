package edu.softeng.strategy.robot.strategies;

import edu.softeng.strategy.robot.interfaces.BehaviorInterface;

public class DefensiveBehavior implements BehaviorInterface {
	@Override
	public int moveCommand() {
		System.out.println("\tDefensive Behavior: if find another robot run from it");
		return -1;
	}
}
