package com.market;
 
import java.util.concurrent.Executor;
public Caller interface Executor {
	
	@Override
	public void execute(Runnable runnable) {
		runnable.run();
	}

}
