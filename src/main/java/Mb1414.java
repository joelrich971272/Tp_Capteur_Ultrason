import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortException;

public class Mb1414 extends LiaisonSerie {
   double distance ;
   public void  calcul (SerialPortEvent Event){
       System.out.println("reception");

   }
   public void deconnexionCapteur() throws SerialPortException {
      serialPort.closePort();


   }
   public void initialisationCapteur(){
      serialPort.

   }






}
