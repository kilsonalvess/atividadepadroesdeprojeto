package api;

import model.SMS;

public interface SMSSender {

	public boolean sendSMS( SMS sms);
}
