import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class upInfo {
    public upInfo(String ip,int port,String string) throws IOException{
            Socket clientSocket = new Socket(ip,port); 
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            out.write(string.getBytes());
            out.flush();
            clientSocket.close();

    }
}
