package rabbitmq.mgmt.model;

/**
 * Statistics about message transmission.
 * 
 * @author Richard Clayton (Berico Technologies)
 */
public class MessageDetails {
	
	protected double rate;
	protected long interval;
	protected long last_event;
	
	public double getRate() {
		return rate;
	}
	
	public long getInterval() {
		return interval;
	}
	
	public long getLastEvent() {
		return last_event;
	}

	@Override
	public String toString() {
		return "MessageDetails [rate=" + rate + ", interval=" + interval
				+ ", last_event=" + last_event + "]";
	}
}
