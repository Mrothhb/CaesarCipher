// Keep these two lines.  They are what tell Java to include the
// classes you need for working with files.
// You might get warnings about them at first.  That's OK, just
// ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/**Your header comment goes here.
 * @author Matthew Roth 
 * @email mrroth@ucsd.edu
 * @ID: cs8bfds 
 * 10/09/2018
 *
 * This program will create "Caesar Cipher"
 * the code is designed to take a word and a
 * numercial value, and encrypt the word byt rotating 
 * each letter in the word the amount of times up or down the
 * alphabet that is provided as a numerical value.
 *
 * */

public class Caesar {
  /**
   *
   * the letterOperation method will take a char value and an int
   * value respectively, as a letter and a number, and it will rotate
   * letter the amount specified by the argument numberical value
   * in the int rotation
   * @param letter the char to rotate 
   * @param rotation the int rotation amount 
   *
   * */
  public static char letterOperation(char letter, int rotation)
  {
    //the number of letters in the alphabet 
    final int ALPHABET = 26;
    //the new number of rotations from mod with rotation and 26
    int newRotation = rotation % ALPHABET;
    //the letter plus the new rotation amount 
    int letterPlusRotation = letter + newRotation;

    //if the char argument is a Letter proceed into the If block
    if(Character.isLetter(letter))
    {
      //if the character argument is an Uppercase letter, proceed into if block
      if(Character.isUpperCase(letter))
      {
        //if the char plus the rotation amount is less than the ASCII value
        //for 'A' then add the amount to the alphabet count, and add that to 
        //the letter 
        if(letterPlusRotation < 'A' )
          letter = (char)(((letterPlusRotation - letter) + ALPHABET) + letter);
        //else if the letter plus the rotation amount is greater than ASCII for
        //'Z' then subtract amount from alphabet count and that will be new 
        //letter 
        else if (letterPlusRotation > 'Z')
          letter =(char)((letterPlusRotation - ALPHABET));
        //else if the letter and rotation falls within parameters, return the 
        //new letter with the rotation amount added to letter 
        else  
          letter = (char)(letterPlusRotation);
      }
      //if the letter char is a Lowercase char enter this if block
      else if (Character.isLowerCase(letter))
      {
        //if the character is a lower case letter and the letter plus the 
        //rotation is less than the lowest ASCII value which is 'a'
        //then add the letter plus rotation amount to the alphabet count 
        //and set that as the new letter 
        if(letterPlusRotation < 'a')
          letter = (char)(((letterPlusRotation - letter) + ALPHABET) + letter);     
        //else if the letter plus the rotation amount is greater than 
        //ASCII value for 'z' then subtract the letter plus rotation amount
        //from the alphabet count, and that will become the new letter 
        else if (letterPlusRotation > 'z')
          letter =(char)((letterPlusRotation - ALPHABET));
        //else the new letter will be the letter plus the rotaiton amount 
        //since it falls within the parameters for 'a' to 'z'
        else 
          letter = (char)(letterPlusRotation);
      }
      //return the letter containing the character plus whatever rotation
      //was done 
      return letter;

    }
    //if the letter was not a letter, and it was a number or a special
    //then return back the letter 
    else 
      return letter;

  }    
/**
 * The encrypt method will rotate each letter in the 
 * string parameter the given amount that is specified
 * from the rotation parameter
 * @message the string word to be encrypted
 * @rotation the amount to rotate char
 *
 *
 * */
  public static String encrypt(String message, int rotation) 
  {
    //if the string contains null value or nothing 
    if(message == null)
      return null;

    else
    {
      //determine the length of the string 
      int length = message.length();
      
      //create an array of characters 
      char[] encryptMessage = new char[length];

      //iterate through the array and add each element in 
      //the string to each element in the array
      for (int i = 0; i < length; i++)
      {
        encryptMessage[i] = message.charAt(i);
      }
      //each iteration set the element i to the rotated char
      //from calling the letterOperation method
      for (int j = 0; j < length; j++)
      {
        encryptMessage[j] = letterOperation(encryptMessage[j], rotation);
      }
      //create string from the array of characters 
      String encryptedMessage = new String(encryptMessage);

      //return the string 
      return encryptedMessage;

    }
  }

  /**
   *take the encrypted string as an argument 
   * and the rotation value and rotate the char
   * back to the original string 
   * @param message the string to alter
   * @rotation the amount to rotate back
   *
   * */
  public static String decrypt(String message, int rotation) 
  {
    //if the string is null return null
    if(message == null)
      return null;
  
    //this follows similar logic to method encrypt 
    else
    {
      int length = message.length();

      char[] decryptMessage = new char[length];

      for (int i = 0; i < length; i++)
      {
        decryptMessage[i] = message.charAt(i);
      }
      //same logic as encrypt method with a negative rotation 
      for (int j = 0; j < length; j++)
      {
        //the rotation is set negative to rotate backwards characters
        decryptMessage[j] = letterOperation(decryptMessage[j], -(rotation));
      }

      String decryptedMessage = new String(decryptMessage);

      return decryptedMessage;

    }

  }

  /**
   * this method is the same as encrypt() 
   * with the addition of a StringBuilder instead 
   * of using a String to create the word encryption
   *@param message the word to encrypt
   @param rotation the amount of times to rotate 
   *
   * */
  public static String encryptTwo(String message, int rotation) {


    if(message == null)
      return null;

    else
    {
      int length = message.length();

      char[] encryptMessageTwo = new char[length];

      for (int i = 0; i < length; i++)
      {
        encryptMessageTwo[i] = message.charAt(i);
      }

      for (int j = 0; j < length; j++)
      {
        encryptMessageTwo[j] = letterOperation(encryptMessageTwo[j], rotation);
      }
      
      //create an empty String 
      String empty = "";
      //new StringBuilder object created instead of String 
      StringBuilder stringBuilder = new StringBuilder(empty);
      //append the char array to the empty String 
      stringBuilder.append(encryptMessageTwo);

      return stringBuilder.toString();
    }

  }


  /**
   * This method is similar to the decrypt() method 
   * with the alteration of using StringBuilder instead
   * of String when creating the new String to return 
   * @param message the word to alter
   * @param rotation the amount of times to rotate
   * */
  public static String decryptTwo(String message, int rotation) {

    if(message == null)
      return null;

    else
    {
      int length = message.length();

      char[] decryptMessage = new char[length];

      for (int i = 0; i < length; i++)
      {
        decryptMessage[i] = message.charAt(i);
      }

      for (int j = 0; j < length; j++)
      {
        decryptMessage[j] = letterOperation(decryptMessage[j], -(rotation));
      }

      String empty = "";

      StringBuilder stringBuilder = new StringBuilder(empty);

      stringBuilder.append(decryptMessage);

      return stringBuilder.toString();

    }

  }
}
