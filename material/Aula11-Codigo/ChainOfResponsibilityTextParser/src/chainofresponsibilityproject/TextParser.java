/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityproject;

/**
 *
 * @author http://blog.sanaulla.info/2012/09/23/simple-example-to-illustrate-chain-of-responsibility-design-pattern/
 */
public class TextParser extends Parser{
 
  public TextParser(Parser successor){
    super(successor);
  }

  protected boolean canHandleFile(String fileName){
      if(fileName.endsWith(".txt") == true)
          return true;
      return false;
  }  
  
  protected void parseFile(String fileName) {
      System.out.println("A text parser is handling the file: "+fileName);     
  }
  public String getName(){
      return "TXT";
  }


}
