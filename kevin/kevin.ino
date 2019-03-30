
#include <SoftwareSerial.h>
SoftwareSerial SIM900(10, 11);

String numero;
String mensaje;
String mensaje2;

int i = 0;

void setup() {

  // put your setup code here, to run once:
  //digitalWrite(9, HIGH); // Descomentar para activar la alimentación de la tarjeta por Software
  //delay(1000);
  //digitalWrite(9, LOW);
  pinMode(11,OUTPUT);
  digitalWrite(11,HIGH);
  delay (5000);  //Nos damos un tiempo para encender el GPRS y la alimentación de la tarjeta
  SIM900.begin(19200);  //Configura velocidad del puerto serie para el SIM900
  Serial.begin(19200);  //Configura velocidad del puerto serie del Arduino
  Serial.println("Iniciando modulo");
  Serial.println("OK");
  delay (1000);
  SIM900.println("AT+CPIN=\"XXXX\"");  //Comando AT para introducir el PIN de la tarjeta
  delay(25000);  //Tiempo para que encuentre una RED
  Serial.println("Esperando mensajes");
  digitalWrite(11,LOW);
}

void llamar()
{
  Serial.println("Realizando llamada...");
  SIM900.println("ATD0991327413;");  //Comando AT para realizar una llamada
  delay(30000);  // Espera 30 segundos mientras realiza la llamada
  SIM900.println("ATH");  // Cuelga la llamada
  delay(1000);
  Serial.println("Llamada finalizada");
}


void mensaje_sms(String numer, String mensaj)
{
  
  Serial.println("Enviando SMS...");
  SIM900.print("AT+CMGF=1\r");  //Configura el modo texto para enviar o recibir mensajes
  delay(1000);
  String num = String("AT+CMGS=\"");
  num += numer;
  num += "\"";
  Serial.println(num);
  Serial.println(mensaj);
  SIM900.println(num);  //Numero al que vamos a enviar el mensaje
  delay(1000);
  SIM900.print("Se ha generado una factura electrónica, su voalor a pagar es $");
  SIM900.print(mensaj);
  SIM900.println(". Los detalles de su factura se enviaron a su correo electrónico");// Texto del SMS
  digitalWrite(13,HIGH);
  delay(100);
  SIM900.println((char)26); //Comando de finalización ^Z
  delay(100);
  SIM900.println();
  delay(5000);  // Esperamos un tiempo para que envíe el SMS
  Serial.println("SMS enviado");
  digitalWrite(13,LOW);
}

void loop()
{
  while (Serial.available()) {
    char caracter = Serial.read();
    if (numero.length() < 10) {
      numero += caracter;
    } else {      
       mensaje += caracter;      
    }
    delay(30);
  }
  if (numero.length() == 10) {
    // Serial.println("El numero de celular es: " + numero+"\n");
    //Serial.println("El mensaje es : " + mensaje);
    mensaje_sms(numero, mensaje); //mensaje
    delay(10);
    Serial.println("ok");
    delay(1000);
    mensaje = "";
    numero = "";
    i = 0;
  }




}


