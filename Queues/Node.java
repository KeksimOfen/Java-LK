/**
 * Beschreiben Sie hier die Klasse Node.
 * 
 * @author (Johannes) 
 * @version (25.10)
 */
public class Node
{
    protected Node next;
    protected Object content;
    
    public Node(Object pContent)
    {
        content = pContent;
    }
    
    public void setNext(Node pNode)
    {
        next = pNode;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public Object getContent()
    {
        return content;
    }
}
