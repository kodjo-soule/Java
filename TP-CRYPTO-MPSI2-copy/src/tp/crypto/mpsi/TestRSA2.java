package tp.crypto.mpsi;

import java.math.BigInteger;
import java.security.* ;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Scanner;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestRSA2 {

    

    public TestRSA2() {
        // constructor
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        TestRSA2 rsa = new TestRSA2();
        rsa.executer1();
        
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair kp = kpg.genKeyPair();
        RSAPublicKey pub = (RSAPublicKey)kp.getPublic();
        RSAPrivateCrtKey priv = (RSAPrivateCrtKey)kp.getPrivate();
        
        
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128);
        SecretKey sk = kg.generateKey();
        
        
    }
    public void executer1() {
    	BigInteger[] mescle ;
    	mescle = genererCle2(512);
    	System.out.println("-----------------------------------------------------------------");
        System.out.println("Modulo n : "+mescle[0]);
        System.out.println("Exposant public e : "+mescle[1]);
        System.out.println("Exposant privee d : "+mescle[2]);
        
        String message = getMessage();
        BigInteger message_chiffree = m_chiffrer1(message, mescle);
        
        System.out.println("Message Chiffree : " + new String(message_chiffree.toByteArray()));
        String message_dechiffree = m_dechiffrer1(message_chiffree, mescle);
        
        System.out.println("Message dechiffree: " + message_dechiffree);
    	
    }
    

    
    public BigInteger[] genererCle2(int taille) {
    	BigInteger p,q,n,phi, e, d ;
    	System.out.println("Generation des cles 2");
        p = BigInteger.probablePrime(taille/2, new SecureRandom());
        q = BigInteger.probablePrime(taille/2, new SecureRandom());
        //Calcul du modulo n et du nombre d'euler phi
        //represnte la taille de cle
        n = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        //Generation de l'exposant public 
        e = new BigInteger(taille/4, new SecureRandom());
        while (e.gcd(phi).intValue() != 1) {
            e = new BigInteger(taille/4, new SecureRandom());
        }
        //Calcul de l'exposant privee
        d = e.modInverse(phi);
        BigInteger[] cle = {n,e,d} ;
        return cle ;
    }


    public String getMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message:");
        String message = sc.nextLine();
        return message;
    }

    public BigInteger m_chiffrer1(String message, BigInteger[] mesCle) {
    	
    	BigInteger m = new BigInteger(message.getBytes());
        return m.modPow(mesCle[1], mesCle[0]);
    }


    public String m_dechiffrer1(BigInteger text_chiffree,BigInteger[] mesCle ) {
        BigInteger m = text_chiffree.modPow(mesCle[2], mesCle[0]);
        return new String(m.toByteArray());
    }
    
}

