package tp.crypto.mpsi;

import java.math.BigInteger;
import java.security.* ;
import java.util.Scanner;

public class TestRSA {
	//
	
	public TestRSA() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Declaration des variable*/
        BigInteger p, q, n, phi, e, d ;
        //Generation des nombres premiers
        p = BigInteger.probablePrime(1024, new SecureRandom());
        q = BigInteger.probablePrime(1024, new SecureRandom());
        //Calcul du modulo n et du nombre d'euler phi
        //represnte la taille de cle
        n = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        //Generation de l'exposant public 
        e = new BigInteger(256, new SecureRandom());
        while(e.gcd(phi).intValue()!=1){
            e = new BigInteger(256, new SecureRandom());
            
        }
        //Calcul de l'exposant privee
        d = e.modInverse(phi);
        //Affichage
        System.out.println("Modulo n="+n);
        System.out.println("Exposant public e="+e);
        System.out.println("Exposant privee d="+d);     
        //saisi et conversion des donnees en BigInteger
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un message");
        String message = sc.nextLine();
        BigInteger m = new BigInteger(message.getBytes());
        //Chiffrement
        BigInteger chiffre = m.modPow(e,n);
        System.out.println("Chiffre = "+new String(chiffre.toByteArray()));
        //Dechiffrement
        BigInteger dechiffre = chiffre.modPow(d,n);
        System.out.println("Clair = "+new String(dechiffre.toByteArray()));
	}

}
