/**
 * Beschreiben Sie hier die Klasse Queue.
 * 
 * @author (Johannes) 
 * @version (25.10)
 */

public class Queue
{
    private Node first, last, enqueued;
    
    public Queue()
    {
        last = null;
        first = null;
    }

    public Object first()
    {
        return first.getContent();
    }
    
    void enqueue(Object pContent)
    {
        enqueued = new Node(pContent);
        if(first==null)
        {
            enqueued.setNext(null);
            first = enqueued;
            last = enqueued;
        }
        else
        {
            last.setNext(enqueued);
            last = enqueued; 
        }
    }
    
    public void dequeue()
    {
        if(first!=null)
        {
            first = first.getNext();            
            if(first==null)
            {
                last = null;
            }
        }
    }
    
    public boolean isEmpty()
    {
        if(first==null)
        {
            return true;
        }
        return false;
    }
}
