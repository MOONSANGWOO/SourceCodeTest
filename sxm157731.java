package AES;

public class sxm157731{
	public static void main(String args[]){
		String PLAINTEXT = "0123456789abcdef";
		String KEY = "0123456789abcdef";
		int ROUND = 10;
		
		AES AES = new AES();
		
		String EncryptedText = AES.Encrypt(PLAINTEXT, KEY, ROUND);
		String DecryptedText = AES.Decrypt(EncryptedText, KEY, ROUND);
		
		/*
		 * Print out Result
		 */
		System.out.println("****************************************");
		System.out.println("Result of AES Encryption");
		System.out.println("Plaintext      : " + PLAINTEXT);
		System.out.println("Encrypted text : " + EncryptedText);
		System.out.println("****************************************");
		System.out.println("Result of AES Decryption");
		System.out.println("Ciphertext     : " + EncryptedText);
		System.out.println("Decrypted text : " + DecryptedText);
		System.out.println("****************************************");
	}
}
