package ru.skillfactory;


/**
 * Class for encrypt and decrypt input strings by Caesar algorithm
 */
public class Cipher {

    private int offset;

    public Cipher(int offset) {
        this.offset = offset;
    }

    public StringBuilder process(String message, boolean isEncrypt) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            int originalAlphabetPosition = character - 'a';
            int newAlphabetPosition = (originalAlphabetPosition + ((isEncrypt) ? offset : -1 *offset));
            char newCharacter = (char) ('a' + newAlphabetPosition);
            result.append(newCharacter);
        }
        return result;
    }
}
