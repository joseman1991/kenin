int i=1;
#include <SoftwareSerial.h>
SoftwareSerial SIM900(10, 11);
void setup()
   {
      //digitalWrite(9, HIGH); // Descomentar para activar la alimentación de la tarjeta por Software
      //delay(1000); 
      //digitalWrite(9, LOW);
      delay (5000);  //Nos damos un tiempo para encender el GPRS y la alimentación de la tarjeta
      SIM900.begin(19200);  //Configura velocidad del puerto serie para el SIM900
      Serial.begin(19200);  //Configura velocidad del puerto serie del Arduino
      Serial.println("OK");
      delay (1000);
      SIM900.println("AT+CPIN=\"XXXX\"");  //Comando AT para introducir el PIN de la tarjeta
      delay(25000);  //Tiempo para que encuentre una RED
   }

   
void loop(){
  if(i==1){
 mensaje_sms();
    i++;
  }
}
void mensaje_sms()
   {
      Serial.println("Enviando SMS...");
      SIM900.print("AT+CMGF=1\r");  //Configura el modo texto para enviar o recibir mensajes
      delay(1000);
      SIM900.println("AT+CMGS=\"0991327413\"");  //Numero al que vamos a enviar el mensaje
      delay(1000);
      SIM900.println("SMS enviado desde un Arduino. Saludos de Prometec.");  // Texto del SMS
      delay(100);
      SIM900.println((char)26); //Comando de finalización ^Z
      delay(100);
      SIM900.println();
      delay(5000);  // Esperamos un tiempo para que envíe el SMS
      Serial.println("SMS enviado");
   }
