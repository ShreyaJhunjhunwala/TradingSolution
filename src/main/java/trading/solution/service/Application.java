package trading.solution.service;

import java.util.HashMap;

import merchant.solution.service.SignalHandler;

class Application implements SignalHandler {

	HashMap<Integer, SignalRegisterStrategy> signalToRule = new HashMap<>();

	public void handleSignal(int signal) {

		SignalRegisterStrategy signalRegisterStrategy = signalToRule.getOrDefault(signalToRule,
				SignalRegisterStrategy.DEFAULT);

		performOperation(signalRegisterStrategy);

	}

	private void performOperation(SignalRegisterStrategy signalRegisterStrategy) {
		signalRegisterStrategy.getSignalOperation().executeByRule();
		signalRegisterStrategy.getSignalOperation().execute();
	}

	private void addSignal(int signal, SignalRegisterStrategy signalRegisterStrategy) {
		signalToRule.put(signal, signalRegisterStrategy);
	}

	public void allSignals() {
		addSignal(1, SignalRegisterStrategy.ONE);
		addSignal(2, SignalRegisterStrategy.TWO);
		addSignal(3, SignalRegisterStrategy.THREE);
	}
}
