import java.io.*;
import java.net.Socket;

public class Tasks implements Runnable {

    private Socket client;

    public Tasks(Socket client) {
        this.client=client;
    }

    @Override
    public void run() {
                try {
                      handlerSocket();
                   } catch (IOException e) {
                      e.printStackTrace();
                   }
          }

    private void handlerSocket() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String temp;
        int index;
        while ((temp=br.readLine()) != null) {
            System.out.println(temp);
            if ((index = temp.indexOf("over")) != -1) {//遇到over时就结束接收
                sb.append(temp.substring(0, index));
                break;
            }
            sb.append(temp);
        }
        System.out.println("from client: " + sb);

        //处理接收的查询语句





        //读完后写一句
        Writer writer = new OutputStreamWriter(client.getOutputStream());
        writer.write("Hello Client.");
        writer.write("over\n");
        writer.flush();
        writer.close();
        br.close();
        client.close();

    }
}
