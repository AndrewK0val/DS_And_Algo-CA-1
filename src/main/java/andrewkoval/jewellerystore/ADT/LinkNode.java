package andrewkoval.jewellerystore.ADT;

public class LinkNode<T> {

    public LinkNode<T> next=null;
    public T contents; //ADT reference!
    public T getContents() { return contents; }
    public void setContents(T c) { contents=c; }

}
