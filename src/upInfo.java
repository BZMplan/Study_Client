
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class upInfo {
    public upInfo(String ip,int port,String string) throws UnknownHostException, IOException{
        Socket clientSocket =new Socket(ip,port);
        DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        out.write(string.getBytes());
        out.flush();
        clientSocket.close();
    }
}
