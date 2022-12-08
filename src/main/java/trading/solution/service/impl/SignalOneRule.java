package trading.solution.service.impl;

import trading.solution.service.SignalOperation;

public class SignalOneRule extends SignalRuleExecute implements SignalOperation {

	@Override
	public void executeByRule() {

		algo.setUp();
		algo.setAlgoParam(1, 60);
		algo.performCalc();
		algo.submitToMarket();

	}

}
