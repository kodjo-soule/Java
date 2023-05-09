package tp.crypto.mpsi;

import java.math.BigInteger;
import java.security.* ;
import java.util.Scanner;

public class TestRSA2 {

    private BigInteger p, q, n, phi, e, d;

    public TestRSA2() {
        // constructor
    }

    public static void main(String[] args) {
        TestRSA2 rsa = new TestRSA2();
        rsa.executer1();
    }
    public void executer1() {
    	BigInteger[] mescle ;
    	mescle = genererCle2(1024);
    	System.out.println("-----------------------------------------------------------------");
        System.out.println("Modulo n : "+mescle[0]);
        System.out.println("Exposant public e : "+mescle[1]);
        System.out.println("Exposant privee d : "+mescle[2]);
        
        String message = getMessage();
        BigInteger message_chiffree = m_chiffrer1(message, mescle);
        
        System.out.println("Message Chiffree : " + message_chiffree);
        String message_dechiffree = m_dechiffrer1(message_chiffree, mescle);
        
        System.out.println("Message dechiffree: " + message_dechiffree);
    	
    }
    public void executer() {
        System.out.println("Test RSA 2");
        genererCle();
        String message = getMessage();
        BigInteger message_chiffree = m_chiffrer(message);
        
        System.out.println("Message Chiffree : " + message_chiffree);
        String message_dechiffree = m_dechiffrer(message_chiffree);
        
        System.out.println("Message dechiffree: " + message_dechiffree);
    }

    public void genererCle() {
    	System.out.println("Generation des cles");
        p = BigInteger.probablePrime(1024, new SecureRandom());
        q = BigInteger.probablePrime(1024, new SecureRandom());
        //Calcul du modulo n et du nombre d'euler phi
        //represnte la taille de cle
        n = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        //Generation de l'exposant public 
        e = new BigInteger(256, new SecureRandom());
        while (e.gcd(phi).intValue() != 1) {
            e = new BigInteger(256, new SecureRandom());
        }
        //Calcul de l'exposant privee
        d = e.modInverse(phi);
        
        //Affichage
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Modulo n : "+n);
        System.out.println("Exposant public e : "+e);
        System.out.println("Exposant privee d : "+d);     
        
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
    
    public BigInteger m_chiffrer(String message) {
        BigInteger m = new BigInteger(message.getBytes());
        return m.modPow(e, n);
    }

    public String m_dechiffrer(BigInteger text_chiffree) {
        BigInteger m = text_chiffree.modPow(d, n);
        return new String(m.toByteArray());
    }
}

