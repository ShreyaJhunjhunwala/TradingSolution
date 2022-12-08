package trading.solution.service;

import trading.solution.service.impl.DefaultSignalRule;
import trading.solution.service.impl.SignalOneRule;
import trading.solution.service.impl.SignalThreeRule;
import trading.solution.service.impl.SignalTwoRule;

public enum SignalRegisterStrategy {

	ONE(1, "One", new SignalOneRule()), TWO(2, "Two", new SignalTwoRule()), THREE(3, "Three", new SignalThreeRule()),
	DEFAULT(0, "Deafult", new DefaultSignalRule());

	private long id;
	private String name;
	private SignalOperation signalOperation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SignalOperation getSignalOperation() {
		return signalOperation;
	}

	public void setSignalOperation(SignalOperation signalOperation) {
		this.signalOperation = signalOperation;
	}

	private SignalRegisterStrategy(long id, String name, SignalOperation signalOperation) {
		this.id = id;
		this.name = name;
		this.signalOperation = signalOperation;
	}

	public static SignalRegisterStrategy forValue(Long id) {
		for (SignalRegisterStrategy signalFilterStrategy : SignalRegisterStrategy.values()) {
			if (signalFilterStrategy.getId() == id) {
				return signalFilterStrategy;
			}
		}
		return null;
	}
}
