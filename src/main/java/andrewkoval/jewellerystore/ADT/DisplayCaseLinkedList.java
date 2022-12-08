package andrewkoval.jewellerystore.ADT;
import andrewkoval.jewellerystore.Models.DisplayCase;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeView;


public class DisplayCaseLinkedList {


        public LinkNode head=null;

        public void addElement(DisplayCase e) { //Add element to head of list
            LinkNode<DisplayCase> fn=new LinkNode<>();
            fn.setContents(e);
            fn.next=head;
            head=fn;
        }

        public void clear() { //Empty list
            head=null;
        }


        public void addToListView(ListView lv) {
            lv.getItems().clear();
            LinkNode temp = head;
            while(temp!= null) {
                lv.getItems().add(temp.getContents());
                temp = temp.next;
            }
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

        public void deleteElement(DisplayCase e) {
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



