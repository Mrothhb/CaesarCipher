public class CaesarTester{
  //demo code for Caesar
  public static void main(String[] args)
  {
    String[] words = new String[]{"ABC","abc","ZYX","zyx","!@#","","123"};
    
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j<27; j++){
      System.out.println(words[i]);
      words[i] = Caesar.encrypt(words[i],j);
      System.out.println(words[i]);
      words[i] = Caesar.decrypt(words[i],j);
      System.out.println(words[i]);
      System.out.println();
      }

    }

     for(int i = 0; i < 6; i++)
    {
      System.out.println(words[i]);
      words[i] = Caesar.encrypt(words[i],Integer.MAX_VALUE);
      System.out.println(words[i]);
      words[i] = Caesar.decrypt(words[i],Integer.MAX_VALUE);
      System.out.println(words[i]);
      System.out.println();
      
    }

     for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 27; j++)
      {
      System.out.println(words[i]);
      words[i] = Caesar.encrypt(words[i],-j);
      System.out.println(words[i]);
      words[i] = Caesar.decrypt(words[i],-j);
      System.out.println(words[i]);
      System.out.println();

      }
      
    }

     /*for(int i = 0; i < 6; i++)
    {
      System.out.println(words[i]);
      words[i] = Caesar.encrypt(words[i],Integer.MIN_VALUE);
      System.out.println(words[i]);
      words[i] = Caesar.decrypt(words[i],Integer.MIN_VALUE);
      System.out.println(words[i]);
      System.out.println();
      
    }*/
  }
}

