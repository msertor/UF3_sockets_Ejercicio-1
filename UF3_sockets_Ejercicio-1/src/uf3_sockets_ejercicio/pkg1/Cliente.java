
package uf3_sockets_ejercicio.pkg1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente {
    
    public static void main(String[] args) throws IOException {
        
        Socket misocket = new Socket ("localhost",9999); //Creación y conexión del socket
        
        System.out.println("Los datos del socket son:");
        System.out.println("Dirección" + misocket.getLocalAddress());
        System.out.println("Puerto " + misocket.getPort());
        
        //Creación del canal de envío
        DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
        
        System.out.println("Soy el cliente y envío: Hola");
        flujo_salida.writeUTF("Hola "); //Contenido del flujo de envío
        
        flujo_salida.close();
        misocket.close();
               
    }
    
}
