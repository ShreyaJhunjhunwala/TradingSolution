package trading.solution.service.impl;

import trading.solution.service.SignalOperation;

public class DefaultSignalRule extends SignalRuleExecute implements SignalOperation {

	@Override
	public void executeByRule() {

		algo.cancelTrades();

	}

}
