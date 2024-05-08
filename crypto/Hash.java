import java.security.MessageDigest;
import java.util.Base64;
public class Hash {
    public  static void main(String args[]) {
        try {
            //MD5, SHA-1, SHA-256, SHA-512
            MessageDigest md = MessageDigest.getInstance("MD5");
            String chave = "The quick brown fox jumps over the lazy dog";
            byte[] buffer = md.digest(chave.getBytes());
            System.out.println(buffer.length+":"
                    +Base64.getEncoder().encodeToString(buffer));
                    String chave2 = "The quick brown fox jumps over the lazy cog";
            buffer = md.digest(chave2.getBytes());
            System.out.println(buffer.length+":"
                    +Base64.getEncoder().encodeToString(buffer));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}