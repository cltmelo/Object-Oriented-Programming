/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityproject;

/**
 *
 * @author
 * http://blog.sanaulla.info/2012/09/23/simple-example-to-illustrate-chain-of-responsibility-design-pattern/
 */
public abstract class Parser {

    private Parser successor;

    public Parser(Parser umSucessor){
        successor = umSucessor;
    }
    public Parser(){

    }    
    public Parser getSuccessor() {
        return successor;
    }

    public void setSuccessor(Parser successor) {
        this.successor = successor;
    }

    protected abstract boolean canHandleFile(String fileName);    
    protected abstract void parseFile(String sFileName);

    public abstract String getName();
    public void parse(String fileName) {
        System.out.println(this.getName());
        if (this.canHandleFile(fileName)) {
            this.parseFile(fileName);
        }else if (getSuccessor() != null) {
            getSuccessor().parse(fileName);
        } else {
            System.out.println("Unable to find the correct parser for the file: " + fileName);
        }
    }
}