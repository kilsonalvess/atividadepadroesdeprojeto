import api.SMSSender;
import api.TimService;
import model.SMS;

public class AppSMSNotification {

	public static void main(String[] args) {
		SMSSender sender = new TimService();
		
		SMS message = new SMS("83988885544","83988221133","Bom dia. Seu boleto ja esta disponivel para pagamento");
		
		sender.sendSMS(message);		
		
		
	}
}
