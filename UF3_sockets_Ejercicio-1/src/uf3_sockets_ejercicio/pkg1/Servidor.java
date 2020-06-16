
package uf3_sockets_ejercicio.pkg1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

    
    public static void main(String[] args) throws IOException {
        
        ServerSocket servidor = new ServerSocket(9999);//Creación de socket y asignación de puerto
        
        Socket misocket = servidor.accept();//aceptación de la conexión
        
        //Creación del canal para recibir datos
        DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
        
        //Recibir los procesos como texto
        String mensaje_texto = flujo_entrada.readUTF();
        
        System.out.print("Soy el server y acabo de recibir del cliente: " + mensaje_texto);
        
        flujo_entrada.close();//cierre del canal
        misocket.close();//cierre del socket
        
    }
    
}
