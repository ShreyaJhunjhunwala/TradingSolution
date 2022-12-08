package trading.solution.service.impl;

import merchant.solution.service.Algo;

public class SignalRuleExecute {

	public Algo algo;

	public SignalRuleExecute() {
		this.algo = new Algo();
	}
	
	public void execute() {
		algo.doAlgo();

	}
}
