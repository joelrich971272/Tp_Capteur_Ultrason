import jssc.SerialPortEvent;
import jssc.SerialPortException;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;

public class Mb1414 extends LiaisonSerie {
   private static double distance ;
   DecimalFormat df = new DecimalFormat("0.## cm");
   Instant tInit ;
   Instant tFinal ;
   public void Mb1414 (){
      listerLesPorts().forEach(unCom-> System.out.println(unCom));

   }
   public void  calcul (SerialPortEvent Event){
       calcul();

   }

   private void calcul() {
   }


   public void deconnexionCapteur() throws SerialPortException {
      serialPort.closePort();


   }

   @Override
   public void serialEvent(SerialPortEvent event) {
      byte[] laTram = lireTrame(event.getEventValue());
      if (laTram.length==8){
         Instant.now();
         distance=(laTram[1]-0x30)*100 + (laTram[2]-0x30)*10 + (laTram[3]-0x30)*2.54;
         System.out.println(df.format(distance));
         tFinal = Instant.now();
         calcul(event);
         Duration.between(tInit,tFinal);

      }
      super.serialEvent(event);
   }


   public void initialisationCapteur(String initCapteur) throws SerialPortException {
   super.initCom(initCapteur);
   super.configurerParametres(57600,8,0,1);


   }

   public double getDistance() {
      return distance;
   }

   public void setDistance(double distance) {
      this.distance = distance;
   }
}
