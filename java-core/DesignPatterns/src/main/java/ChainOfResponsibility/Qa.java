package ChainOfResponsibility;
/**
 *  A member of the chain
 *  The resposibility of QA is test 
 */

public class Qa implements Chain {
    private Chain nextChain = null;
    private String responsibility = "Test";
    
    public Qa() {
    }
    public void addChain(Chain c) {
        nextChain = c;
    }
    
    public Chain getChain() {
        return nextChain;
    }
    
    public void sendToChain(String mesg) {
        if(mesg.equals(responsibility)) {
            System.out.println("A QA  -->  Test");
        } else {
            if(nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }
    
}