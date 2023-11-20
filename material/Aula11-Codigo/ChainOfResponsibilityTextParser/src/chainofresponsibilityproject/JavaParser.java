/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibilityproject;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class JavaParser extends Parser{
  
    public JavaParser(Parser successor){
        super(successor);
  }
     
  
  protected boolean canHandleFile(String fileName){
    return fileName.endsWith(".java");
  }  
  protected void parseFile(String fileName) {
      System.out.println("A Java parser is handling the file: "+fileName);
  }
  public String getName(){
      return "JAVA";
  }  
}