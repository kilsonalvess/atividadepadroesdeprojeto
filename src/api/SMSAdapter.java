package api;

import model.SMS;

import java.time.LocalDateTime;

public class SMSAdapter implements  SMSSender{
    private VivoService vivoService;

    public SMSAdapter (VivoService vivoService){
        this.vivoService = vivoService;
    }
    @Override
    public boolean sendSMS(SMS sms) {
        try {
            String origem = sms.getOrigem();
            String destino = sms.getDestino();
            LocalDateTime timestamp = sms.getTimestamp();
            String[] msgs = splitMessage (sms.getTexto());

            this.vivoService.enviarSMS(origem,destino,timestamp,msgs);
            return true;

        } catch (SMSException e) {
            throw new RuntimeException(e);
        }
    }
    private String[] splitMessage(String texto) {
        int chunkSize = 120;
        int length = texto.length();
        int numChunks = (int) Math.ceil((double) length / chunkSize);
        String[] chunks = new String[numChunks];

        for (int i = 0 ; i < numChunks; i++){
            int startIndex = i * chunkSize;
            int endIndex = Math.min((i + 1 ) * chunkSize,length);
            chunks[i]= texto.substring(startIndex,endIndex);

        }
        return chunks;
    }
}
