package andrewkoval.jewellerystore.ADT;

import andrewkoval.jewellerystore.Models.DisplayTray;
import javafx.scene.control.ListView;

public class DisplayTrayLinkedList {
    public LinkNode head=null;

    public void addElement(DisplayTray e) { //Add element to head of list
        LinkNode<DisplayTray> fn=new LinkNode<>();
        fn.setContents(e);
        fn.next=head;
        head=fn;


    }

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

    public void assignToDisplayCase()
    {


    }



    public void deleteElement(DisplayTray e)
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
    //add in methods .. delete get find
}

