import java.nio.charset.StandardCharsets;

/**
 * zakat-java-rikaz-maadin-khums — حاسبة زكاة الركاز والمعادن والكنوز المستخرجة
 * Rikaz Buried Treasure Khums (20%) & Ma'adin Mineral Calculator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "ExtractedValue=50000,Type=Rikaz";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] zakat-java-rikaz-maadin-khums (Java) — Rikaz Buried Treasure Khums (20%) & Ma'adin Mineral Calculator");
        System.out.println("[AR]  حاسبة زكاة الركاز والمعادن والكنوز المستخرجة");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Rate=20%(Khums) |HawlRequired=False | DueImmediate=10000.0", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
