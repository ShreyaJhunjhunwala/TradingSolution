package trading.solution.service.impl;

import trading.solution.service.SignalOperation;

public class SignalTwoRule extends SignalRuleExecute implements SignalOperation {

	@Override
	public void executeByRule() {

		algo.reverse();
		algo.setAlgoParam(1, 80);
		algo.submitToMarket();

	}

}
