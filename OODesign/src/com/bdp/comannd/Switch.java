package com.bdp.comannd;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
