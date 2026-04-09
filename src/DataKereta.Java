import java.util.HashMap;
import java.util.Map;

public class DataKereta {
    public static Map<String, Kereta> daftarKereta = new HashMap<>();

    public static void initData() {
        daftarKereta.put("Argo Bromo", new Kereta("Argo Bromo", "Jakarta - Surabaya", 300000));
        daftarKereta.put("Taksaka", new Kereta("Taksaka", "Jakarta - Yogyakarta", 250000));
        daftarKereta.put("Lodaya", new Kereta("Lodaya", "Bandung - Solo", 200000));
    }
}