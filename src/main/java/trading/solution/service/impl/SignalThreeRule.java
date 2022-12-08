package trading.solution.service.impl;

import trading.solution.service.SignalOperation;

public class SignalThreeRule extends SignalRuleExecute implements SignalOperation {

	@Override
	public void executeByRule() {

		algo.setAlgoParam(1, 90);
		algo.setAlgoParam(2, 15);
		algo.performCalc();
		algo.submitToMarket();

	}

}
