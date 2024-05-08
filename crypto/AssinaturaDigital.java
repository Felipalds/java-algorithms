import javax.crypto.*;
import java.util.Base64;
import java.util.Properties;
import java.security.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class AssinaturaDigital {
    public static void main(String args[]) {
        try  {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
            SecureRandom secRan = new SecureRandom();
            keyGen.initialize(512, secRan);
            KeyPair keyP = keyGen.generateKeyPair();
            PublicKey pubKey = keyP.getPublic();
            PrivateKey priKey = keyP.getPrivate();
            System.out.println("publica: "+pubKey);
            System.out.println("privada: "+priKey);
            //Obtem algoritmo para geração da assinatura
            Signature geradorAss = Signature.getInstance("DSA");
            //Inicializar geração
            geradorAss.initSign(priKey);
            String mensagem = "The quick brown fox jumps over the lazy dog";
            //Gerar assinatura
            geradorAss.update(mensagem.getBytes());
            byte[] assinatura = geradorAss.sign();
            //Grava a mensagem num arquivo properties
            Properties p = new Properties();
            p.put("mensagem", mensagem);
            p.put("assinatura", Base64.getEncoder().encodeToString(assinatura));
            p.store(new FileOutputStream("dado.properties"), null);
            //Serializa a chave pública
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("pubkey.ser"));
            oout.writeObject(pubKey);
            oout.close();
        } catch (Exception ex) {
        }}}