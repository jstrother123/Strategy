package edu.softeng.strategy.robot.strategies;

import edu.softeng.strategy.robot.interfaces.BehaviorInterface;

public class NormalBehavior implements BehaviorInterface {
	@Override
	public int moveCommand() {
		System.out.println("\tNormal Behavior: if find another robot ignore it");
		return 0;
	}
}
