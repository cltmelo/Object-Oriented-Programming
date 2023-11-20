/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityproject;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * http://blog.sanaulla.info/2012/09/23/simple-example-to-illustrate-chain-of-responsibility-design-pattern/
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     
    //List of file names to parse. 
    List<String> fileList = new ArrayList<String>();
    fileList.add("someFile.txt");
    fileList.add("otherFile.json");
    fileList.add("otherFile.java");    
    fileList.add("xmlFile.xml");
    fileList.add("csvFile.csv");
    fileList.add("csvFile.doc");
    
    Parser generalParser = new TextParser(new CsvParser(new JsonParser(new CsvParser(new XmlParser(new JavaParser(null))))));
    //Ou:
    /*Parser xmlParser = new XmlParser();
    Parser csvParser = new CsvParser(xmlParser);    
    Parser jsonParser = new JsonParser(csvParser);
    Parser textParser = new TextParser(jsonParser);
    */
    
    generalParser.parse("arquivo.xml");
    //Pass the file name to the first handler in the chain.
    for ( String fileName : fileList){
      generalParser.parse(fileName);
    }
  }
}