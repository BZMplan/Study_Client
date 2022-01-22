
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class upInfo {
    public upInfo(String ip,int port,String string) throws UnknownHostException, IOException{
        Socket clientSocket =new Socket(ip,port);
        OutputStream os = clientSocket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write(string);
        pw.flush();
        clientSocket.shutdownInput();
    }
}
