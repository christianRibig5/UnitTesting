package data.structure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    private CaesarCipher cipher = new CaesarCipher(3);
    private String message="THE EAGLE IS IN PLA?; MEET AT JOE'S." ;
    private String secret="WKH HDJOH LV LQ SODB; PHHW DW MRH'V.";


    @Before
    public void encryption_decryption_code() {
        System.out.println("Encryption code = " + new String(cipher.encoder));
        System.out.println("Decryption code = " + new String(cipher.decoder));
    }

    @Test
    public void decryption() {
        assertTrue(message.equals(cipher.decrypt(secret)));
    }
}