package data.structures.implementation;

public class CaesarCipher {
    protected char[]encoder=new char[26]; //encryption array
    protected char[]decoder=new char[26]; //decryption array

    public CaesarCipher(int rotation){
        for(int k=0;k<26;k++){
            encoder[k]=(char)('A'+(k+rotation)%26);// create the encoder data
            decoder[k]=(char)('A'+(k-rotation)%26); //create the decoder data
        }
    }

    /** return string representing encrypted message **/
    public String encrypt(String message){
        return transform(message,encoder);
    }

    /** return string representing the decrypted secret**/
    public String decrypt(String secrete){
        return transform(secrete,decoder);
    }

    /** do the main string transformation **/
    private String transform(String original, char[] code) {
        char[]msg=original.toCharArray();
        for(int k=0;k<msg.length;k++){
            if(Character.isUpperCase(msg[k])){
                int j=msg[k]-'A';
                msg[k]=code[j];
            }
        }
        return new String(msg);
    }

}
