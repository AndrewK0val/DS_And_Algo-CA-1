package andrewkoval.jewellerystore.ADT;
import andrewkoval.jewellerystore.Models.JewelleryItem;
import javafx.scene.control.ListView;

public class JewelleryItemLinkedList {
    public LinkNode head=null;

    public void addElement(JewelleryItem e) { //Add element to head of list
        LinkNode fn=new LinkNode();
        fn.setContents(e);
        fn.next=head;
        head=fn;


    }



    public void clear() { //Empty list
        head=null;
    }


    public void addToListView(ListView lv)
    {
        lv.getItems().clear();
        LinkNode temp = head;
        while(temp!= null)
        {
            lv.getItems().add(temp.getContents());
            temp = temp.next;
        }

    }

//        public void addToTreeView(TreeView tv)
//        {
//            LinkNode temp = head;
//            while(temp != null)
//            {
//                tv.
//            }
//
//
//        }


    public int listLenght() {
        LinkNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public void deleteElement(JewelleryItem e)
    {

        LinkNode fn = head;
        int i = 0;
        while(i<4 && fn!=null) {
            fn = fn.next;
            i++;
        }
        if(fn!=null && fn.next!=null) {
            fn.next=fn.next.next;
        }


    }
}
