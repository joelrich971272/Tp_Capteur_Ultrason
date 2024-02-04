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

   @Override
   public void serialEvent(SerialPortEvent event) {
      super.serialEvent(event);
   }

   public void initialisationCapteur() throws SerialPortException {
      serialPort.addEventListener(serialPortEvent ->);

   }

   public double getDistance() {
      return distance;
   }

   public void setDistance(double distance) {
      this.distance = distance;
   }
}
