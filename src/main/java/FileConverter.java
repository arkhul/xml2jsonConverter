import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileConverter {

    public static final File xmlFile = new File("PurchaseOrders.xml");

    public static void main(String[] args) throws IOException {
        convert(xmlFile);
    }

    public static void convert(File file) throws IOException {
        byte[] bytes = Files.readAllBytes(file.toPath());
        String xml = new String(bytes);
        JSONObject json = XML.toJSONObject(xml);
        String jsonString = json.toString(2);
        System.out.println(jsonString);
    }
}
