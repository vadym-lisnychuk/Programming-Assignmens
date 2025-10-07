import java.util.*;

public class TestNewAltList
{
   private static class AnException extends Exception
   {
      public AnException(String message)
      {
         super(message);
      }
   }
   
   public static void main(String[] args)
   {
      NewAltList<String> words = new NewAltList<>();
      
      for(int i = 0; i < 4; i++)
      {
         words.addBeginning(Character.toString((char)(i + 94)));
         words.addEnd(Character.toString((char)(120 - 2 * i)));        
      }
      
      NewAltList<Integer> numbers = new NewAltList<>();

      for(int i = 0; i < 3; i++)
      {
         numbers.addEnd(9 * i - 3);
         numbers.addBeginning(4 * i * i + 2);
         numbers.addEnd(i * i - 2 * i - 1);        
      }
      
      List<String> ans1 = new LinkedList<>(
         List.of("a","`","_","^","x","v","t","r"));
      List<Integer> ans2 = new LinkedList<>(
         List.of(18, 6, 2, -3, -1, 6, -2, 15, -1));
      
      boolean passedAllChecks = true;
      
      try
      {
         if(words.size() != ans1.size())
            throw new AnException(String.format("Size field of words is " +
               "equal to %d but should be equal to %d.", words.size(), 
               ans1.size()));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;
      }
      
      try
      {
         if(numbers.size() != ans2.size())
            throw new AnException(String.format("Size field of numbers is " +
               "equal to %d but should be equal to %d.", numbers.size(), 
               ans2.size()));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;
      }
         
      for(int i = 0; i < Math.min(ans1.size(), words.size()); i++)
      {
         try
         {
            if(!(words.get(i).equals(ans1.get(i))))
               throw new AnException(String.format("Words: Element at index %d " +
               "is equal to %s but should be equal to %s.", 
               i, words.get(i), ans1.get(i)));   
         }
         catch(AnException e)
         {
            System.out.println(e.getMessage());
            passedAllChecks = false;
         }   
      }
         
      for(int i = 0; i < Math.min(ans2.size(), numbers.size()); i++)
      {
         try
         {
            if(!(numbers.get(i).equals(ans2.get(i))))
               throw new AnException(String.format("Numbers: Element at index %d " +
               "is equal to %d but should be equal to %d.", 
               i, numbers.get(i), ans2.get(i)));   
         }
         catch(AnException e)
         {
            System.out.println(e.getMessage());
            passedAllChecks = false;
         }   
      }
      
      try
      {
         if(words.getHead() == null)
            throw new AnException("Head of words is null.");
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }

      try
      {
         if(numbers.getHead() == null)
            throw new AnException("Head of numbers is null.");
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }
      
      try
      {
         if(words.getTail() == null)
            throw new AnException("Tail of words is null.");
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }

      try
      {
         if(numbers.getTail() == null)
            throw new AnException("Tail of numbers is null.");
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }
      
      try
      {
         if(words.getHead() != null && !(words.getHead().element.equals("a")))
            throw new AnException(String.format("Head of words element value should be a but is equal to %s.", words.getHead().element));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }

      try
      {
         if(numbers.getHead() != null && !(numbers.getHead().element.equals(18)))
            throw new AnException(String.format("Head of numbers element value should be 18 but is equal to %d.", numbers.getHead().element));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }

      try
      {
         if(words.getTail() != null && !(words.getTail().element.equals("r")))
            throw new AnException(String.format("Tail of words element value should be r but is equal to %s.", words.getTail().element));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }

      try
      {
         if(numbers.getTail() != null && !(numbers.getTail().element.equals(-1)))
            throw new AnException(String.format("Tail of numbers element value should be -1 but is equal to %d.", numbers.getTail().element));
      }
      catch(AnException e)
      {
         System.out.println(e.getMessage());
         passedAllChecks = false;         
      }
                          
      if(passedAllChecks)
      {
         System.out.println("Everything seems correct.");
      }      
   }
}