package andrewkoval.jewellerystore.Controllers;
import andrewkoval.jewellerystore.ADT.DisplayCaseLinkedList;
import andrewkoval.jewellerystore.ADT.DisplayTrayLinkedList;
import andrewkoval.jewellerystore.ADT.LinkNode;
import andrewkoval.jewellerystore.Driver;
import andrewkoval.jewellerystore.Models.DisplayCase;
import andrewkoval.jewellerystore.Models.DisplayTray;
import andrewkoval.jewellerystore.Models.JewelleryItem;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import com.thoughtworks.xstream.XStream;
import javafx.scene.layout.AnchorPane;
public class JewelleryStoreController implements Initializable {
    @FXML public TextArea JewelleryItemDescriptionInput;
    @FXML private AnchorPane overviewItemMenu;
    @FXML private TextField searchStock, JewelleryItemPriceInput, JewelleryItemImageUrlInput, JewelleryItemQuantityInput;
    @FXML private ComboBox lightingSelection, caseTypeSelection,JewelleryItemBrandNameComboBox,displayTrayMatColourComboBox, displayTrayDimensionsComboBox, JewelleryItemTypeComboBox, JewelleryItemTargetGenderComboBox;
    @FXML private ListView<DisplayCase> displayCaseListViewInTrayTab;
    @FXML private ListView<DisplayTray> displayTrayListView, displayTrayListViewInItemTab;
    @FXML private TreeView<Object> overviewTreeview;
    @FXML private Label displayCaseIdInTrayTab, JewelleryItemIdInItemsTab;
    @FXML private ListView<JewelleryItem> JewelleryItemListView;
    private DisplayCase chosenCase;
    private DisplayTray chosenTray;


    @Override
     public void initialize(URL url, ResourceBundle resourceBundle) {
//         dropdown options
//      newListView.getItems().addAll(n);
        lightingSelection.getItems().addAll("Lit", "Unlit");
        caseTypeSelection.getItems().addAll("Free Standing", "Wall mounted");
        displayTrayMatColourComboBox.getItems().addAll("Burgundy", "Teal", "White", "Off-white", "Crimson Red", "Silver", "Gray", "Jet blacK");
        displayTrayDimensionsComboBox.getItems().addAll("100x400", "200x400", "300x600", "300x800");
        JewelleryItemTypeComboBox.getItems().addAll("Watch", "Ring", "Earrings", "Necklace", "Bracelet", "Piercing");
        JewelleryItemTargetGenderComboBox.getItems().addAll("Male", "Female", "Unisex");
        JewelleryItemBrandNameComboBox.getItems().addAll("Svarowski", "Bea Bongiasca", "Pandora", "Sauer", "Fernando Jorge", "Ondyn", "Viltier", "Chanel", "Cartier");

//      TreeItem<String> rootItem = new TreeItem<>(Driver.displayCaseLinkList);
//      overviewTreeview.setRoot(rootItem);

//        txtID.getText();
        overviewItemMenu.setVisible(false);
    }



        public void addDisplayCase() {
//            String id = txtID.getText();
            int id = totalCases()+1;
            String lit = lightingSelection.getSelectionModel().getSelectedItem().toString();
            boolean isLit=false;
            if (lit.equals("Lit")) {
                isLit=true;
            }
            String type = caseTypeSelection.getSelectionModel().getSelectedItem().toString();
            DisplayCase dc = new DisplayCase(id,type,isLit);
            Driver.cases.addElement(dc);
            System.out.println(Driver.cases.head.getContents());
//            Driver.cases.addToListView(displayCaseListViewInCaseTab);
            Driver.cases.addToListView(displayCaseListViewInTrayTab);
        }

        public void addDisplayTray() {
            int id = totaTrays() + 1;
            String dimensions = displayTrayDimensionsComboBox.getSelectionModel().getSelectedItem().toString();
            String matcol = displayTrayMatColourComboBox.getSelectionModel().getSelectedItem().toString();

            DisplayTray dt = new DisplayTray(id, matcol, dimensions);
            chosenCase.trays.addElement(dt);
           // System.out.println(Driver.displayTrayLinkList.head.getContents());
            chosenCase.trays.addToListView(displayTrayListView);
            chosenCase.trays.addToListView(displayTrayListViewInItemTab);
        }

        public void addJewelleryItem() {
            String quantityInStringFormat = JewelleryItemQuantityInput.getText();
            int quantity = Integer.valueOf(quantityInStringFormat);
            String brandName = JewelleryItemBrandNameComboBox.getSelectionModel().getSelectedItem().toString();
            String description = JewelleryItemDescriptionInput.getText();
            String type = JewelleryItemTypeComboBox.getSelectionModel().getSelectedItem().toString();
            String imageURL = JewelleryItemImageUrlInput.getText();
            String retailPriceStringFormat = JewelleryItemPriceInput.getText(); //figure out how to convert a number in a textfield input to a float
            float retailPrice = Float.valueOf(retailPriceStringFormat);
            String targetGender = JewelleryItemTargetGenderComboBox.getSelectionModel().getSelectedItem().toString();

            // calling constructor for jewellery item
            JewelleryItem ji = new JewelleryItem(brandName, description, type, imageURL, retailPrice, targetGender, quantity);
            chosenTray.items.addElement(ji);
    //        // System.out.println(Driver.displayTrayLinkList.head.getContents());
            chosenTray.items.addToListView(JewelleryItemListView);
    //        chosenCase.trays.addToListView(displayTrayListViewInItemTab);
        }

//        public void addJewelleryItemMaterial(){
////        material, weight, quality
//            String material =
//
//
//        }


    public void searchItem(String searchTerm, String value)
    {
        LinkNode<DisplayCase> temp = Driver.cases.head;
        while(temp!=null){
            LinkNode<DisplayTray> temp2 = temp.getContents().trays.head;
            while(temp2!=null){

//            if(temp2.getContents().items.head)
            {

            }
//                if (searchTerm.contains("price"))
//                {
//                    if(value.equals(temp2.getContents().items.head)){
//
//                    }
//                }
//                if(searchTerm.contains("brand"))
//                {
//
//                }
//                if(searchTerm.contains("type"))
//                {
//
//                }
//                if(searchTerm.contains("gender"))
//                {
//
//                }
                temp2=temp2.next;
            }
            temp=temp.next;
        }
    }



    public void deleteJewelleryItem() {
    overviewTreeview.getSelectionModel().getSelectedItem();
        LinkNode<DisplayCase> temp = Driver.cases.head;

        while(temp!=null){
            LinkNode<DisplayTray> temp2 = temp.getContents().trays.head;


            while(temp2!=null){
                LinkNode<JewelleryItem> temp3 = temp2.getContents().items.head;


                while(temp3!=null){
                    if(overviewTreeview.getSelectionModel().getSelectedItem().equals(temp3.next))
                    {

                    }
                }

                    temp3=temp3.next;
                }

                temp2=temp2.next;
            }
            temp=temp.next;

    }


    public void treeViewDrillDown()
        {
            TreeItem<Object> rootItem = new TreeItem("display Cases");
            LinkNode<DisplayCase> temp = Driver.cases.head;

            while(temp!=null){
                LinkNode<DisplayTray> temp2 = temp.getContents().trays.head;
                TreeItem<Object> dc= new TreeItem(temp.getContents());

                while(temp2!=null){
                    LinkNode<JewelleryItem> temp3 = temp2.getContents().items.head;
                    TreeItem<Object> dt = new TreeItem(temp2.getContents());

                    while(temp3!=null){
                        TreeItem<Object> ji = new TreeItem(temp3.getContents());
                        dt.getChildren().add(ji); //I found out that the order of  these two lines is extremely inportant
                        temp3=temp3.next;
                    }
                    dc.getChildren().add(dt);
                    temp2=temp2.next;
                }
                rootItem.getChildren().add(dc);
                temp=temp.next;
            }
            overviewTreeview.setRoot(rootItem);
            overviewTreeview.setShowRoot(false);
        }

        public void chooseCase(){
            chosenCase = displayCaseListViewInTrayTab.getSelectionModel().getSelectedItem();
            displayCaseIdInTrayTab.setText("Case: " + chosenCase.getCaseID());
            chosenCase.trays.addToListView(displayTrayListView);
            }

        public void chooseTray(){
            chosenTray = displayTrayListViewInItemTab.getSelectionModel().getSelectedItem();
            JewelleryItemIdInItemsTab.setText("Tray: " + chosenTray.getTrayID());
            chosenTray.items.addToListView(JewelleryItemListView);
        }


//  call this method when you change to jewelleryItem tab
//this method loops through every tray in each case and adds the toString of each tray to displayTrayListViewInItemTab
        public void listItemsInDisplayTray()
        {
            displayTrayListViewInItemTab.getItems().clear();
            LinkNode<DisplayCase> temp = Driver.cases.head;
            while(temp!=null){
                LinkNode<DisplayTray> temp2 = temp.getContents().trays.head;
                while(temp2!=null){
                    displayTrayListViewInItemTab.getItems().add(temp2.getContents());
                    temp2=temp2.next;
                }
                temp=temp.next;
            }
        }

        public int totalCases()
        {
        LinkNode<DisplayCase> temp = Driver.cases.head;
        int count = 0;
            while(temp != null)
            {
                count++;
                temp = temp.next;
            }
         return count;
        }

        public int totaTrays()
        {
            LinkNode<DisplayCase> temp = Driver.cases.head;
            int count = 0;
            while(temp != null)
            {
                LinkNode<JewelleryItem> temp2 = temp.getContents().trays.head;
                while(temp2!=null){
                temp2=temp2.next;
                count++;
                }
                temp = temp.next;
            }
            return count;
        }


        public void searchItem(String brandName, String type, float retailPrice)
        {


        }

    public void save() throws Exception {
            XStream xstream = new XStream(new DomDriver());
            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("displayCases.xml"));


            out.writeObject(Driver.cases.head);
            out.close();
        }



//        @SuppressWarnings("unchecked")
        public void load() throws Exception {
            //setting up the xstream object with default security and the above classes
            Class<?>[] classes = new Class[] {DisplayCase.class, LinkNode.class, DisplayTray.class, JewelleryItem.class};
            XStream xstream = new XStream(new DomDriver());
            XStream.setupDefaultSecurity(xstream);

            // Not sure if I should have this, no idea how security works in xstream
            xstream.allowTypes(classes);
//        xstream.addPermission(AnyTypePermission.ANY);

            //doing the actual serialisation to an XML file
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("displayCases.xml"));
            Driver.cases.head = (LinkNode) is.readObject();
            is.close();
            Driver.cases.addToListView(displayCaseListViewInTrayTab);
//

        }


        public void valueStockInOverview(ActionEvent actionEvent) {
        }

        public void selectfromOverview(ActionEvent actionEvent) {
        }



    }






