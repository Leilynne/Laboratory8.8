import java.io.*;
import java.net.URL;

public class InConvertInText {

    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + " Конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("D:\\MyFile1.txt");

            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inURL = new URL("http://google.com").openStream();

            Reader rUrl = new InputStreamReader(inURL, "cp1251");

            readAllByByte(rUrl);
            System.out.println("\n\n\n");
            inURL.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.println("\n\n\n");
            inArray.close();
            rArray.close();

        }catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
