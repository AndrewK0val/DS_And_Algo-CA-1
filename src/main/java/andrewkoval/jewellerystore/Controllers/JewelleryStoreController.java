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
import com.thoughtworks.xstream.*;
import javafx.scene.layout.AnchorPane;
public class JewelleryStoreController implements Initializable {
    @FXML public TextArea JewelleryItemDescriptionInput;
    @FXML private AnchorPane overviewItemMenu;
    @FXML private TextField txtID, searchStock, displayTrayIdInput, JewelleryItemPriceInput, JewelleryItemImageUrlInput, JewelleryItemNameInput, JewelleryItemQuantityInput;
    @FXML private ComboBox lightingSelection, caseTypeSelection, displayTrayMatColourComboBox, displayTrayDimensionsComboBox, JewelleryItemTypeComboBox, JewelleryItemTargetGenderComboBox;
    @FXML private ListView<DisplayCase> displayCaseListViewInCaseTab, displayCaseListViewInTrayTab;
    @FXML private ListView<DisplayTray> displayTrayListView, displayTrayListViewInItemTab;
    @FXML private TreeView<String> overviewTreeview;
    @FXML private Label displayCaseIdInTrayTab, JewelleryItemIdInItemsTab;
    @FXML private ListView<JewelleryItem> JewelleryItemListView;
    private DisplayCase chosenCase;
    private DisplayTray chosenTray;
    public DisplayCase displayCase;
    public DisplayTray displayTray;
    public JewelleryItem jewelleryItem;

    @Override
     public void initialize(URL url, ResourceBundle resourceBundle) {
//         dropdown options
//      newListView.getItems().addAll(n);
        lightingSelection.getItems().addAll("Lit", "Unlit");
        caseTypeSelection.getItems().addAll("Free Standing", "Wall mounted");
        displayTrayMatColourComboBox.getItems().addAll("Burgundy", "Teal", "While", "Off-white", "Crimson Red", "Silver", "Gray", "Jet blacK");
        displayTrayDimensionsComboBox.getItems().addAll("100x400", "200x400", "300x600", "300x800");
        JewelleryItemTypeComboBox.getItems().addAll("Watch", "Ring", "Earrings", "Necklace", "Bracelet", "Piercing");
        JewelleryItemTargetGenderComboBox.getItems().addAll("Male", "Female", "Unisex");


//      TreeItem<String> rootItem = new TreeItem<>(Driver.displayCaseLinkList);
//      overviewTreeview.setRoot(rootItem);
        displayTrayIdInput.getText();
        txtID.getText();
        overviewItemMenu.setVisible(false);
    }



        public void addDisplayCase() {
            String id = txtID.getText();
            String lit = lightingSelection.getSelectionModel().getSelectedItem().toString();
            boolean isLit=false;
            if (lit.equals("Lit")) {
                isLit=true;
            }
            String type = caseTypeSelection.getSelectionModel().getSelectedItem().toString();
            DisplayCase dc = new DisplayCase(id,type,isLit);
            Driver.cases.addElement(dc);
            System.out.println(Driver.cases.head.getContents());
            Driver.cases.addToListView(displayCaseListViewInCaseTab);
            Driver.cases.addToListView(displayCaseListViewInTrayTab);
        }

        public void addDisplayTray() {
            String id = displayTrayIdInput.getText();
            String dimensions = displayTrayDimensionsComboBox.getSelectionModel().getSelectedItem().toString();
            String matcol = displayTrayMatColourComboBox.getSelectionModel().getSelectedItem().toString();

            DisplayTray dt = new DisplayTray(id, matcol, dimensions);
            chosenCase.trays.addElement(dt);
           // System.out.println(Driver.displayTrayLinkList.head.getContents());
            chosenCase.trays.addToListView(displayTrayListView);
            chosenCase.trays.addToListView(displayTrayListViewInItemTab);
        }

        public void addJewelleryItem() {
            String name = JewelleryItemNameInput.getText();
            String description = JewelleryItemDescriptionInput.getText();
            String type = JewelleryItemTypeComboBox.getSelectionModel().getSelectedItem().toString();
            String imageURL = JewelleryItemImageUrlInput.getText();
            float retailPrice = 0; //figure out how to convert a number in a textfield input to a float
            String targetGender = JewelleryItemTargetGenderComboBox.getSelectionModel().getSelectedItem().toString();

            // calling constructor for jewellery item
            JewelleryItem ji = new JewelleryItem(name, description, type, imageURL, retailPrice, targetGender);
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


        public void treeViewDrillDown()
        {
            TreeItem rootItem = new TreeItem("display Cases");
            LinkNode<DisplayCase> temp = Driver.cases.head;
            while(temp!=null)
            {
                LinkNode<DisplayTray> temp2 = temp.getContents().trays.head;
                TreeItem dc= new TreeItem(temp.getContents().toString());
                while(temp2!=null){
                    TreeItem dt = new TreeItem(temp2.getContents().toString());
                    dc.getChildren().add(dt);
                    temp2=temp2.next;
                }
            rootItem.getChildren().add(dc);
            temp=temp.next;
            }
            //TreeView overviewTreeview = new TreeView();
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

        public void chooseItem(){


        }



        public String viewAllStock()
        {
            overviewItemMenu.setVisible(true);
//        for(every display case)
//        {
//        displayCase.listAllDispvlayTrays();
//        }
//      Output should look like a tree
//
//  Case-      case ID, case Type, Lighting
//  Tray-          Tray ID, Inlay material color, tray dimensions (cm)
//  Jewellery-         name, description, type (ring, watch, necklace, etc. ), target gender, image(url), retail price
//  Material/component-      name/type(gold, platinum, diamond,emerald,silver,ruby,), description, quantity, quality(karat, carat)
            return "";
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

        public void displayCaseIdAutoIncrement()
        {



        }

        public void displayTrayIdAutoIncrement()
        {
            LinkNode<DisplayTray> temp = Driver.cases.head;
            while(temp!=null)
            {


            }
        }


    public void save() throws Exception {
            XStream xstream = new XStream(new DomDriver());
            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("displayCases.xml"));
            out.writeObject(displayCase);
            out.close();

            ObjectOutputStream out2 = xstream.createObjectOutputStream(new FileWriter("displayTrays.xml"));
            out.writeObject(displayTray);
            out.close();

            ObjectOutputStream out3 = xstream.createObjectOutputStream(new FileWriter("JewelleryItems.xml"));
            out.writeObject(jewelleryItem);
            out.close();
            //dont forget to include material
        }






        @SuppressWarnings("unchecked")
        public void load() throws Exception {
            //setting up the xstream object with default security and the above classes
            XStream xstream = new XStream(new DomDriver());
           // XStream.setupDefaultSecurity(xstream);

            // Not sure if I should have this, no idea how security works in xstream
            //xstream.allowTypes(classes);
//        xstream.addPermission(AnyTypePermission.ANY);

            //doing the actual serialisation to an XML file
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("displayCase.xml"));
            is.close();
        }


        public void valueStockInOverview(ActionEvent actionEvent) {
        }

        public void selectfromOverview(ActionEvent actionEvent) {
        }


    // public DisplayCase next = null;

    // public DisplayCase head;

    // DisplayCase temp=head;

//public void initialize()
//{
//    lightingSelection.getItems().addAll("Lit", "Unlit");
//    caseTypeSelection.getItems().addAll("Free Standing", "Wall mounted");
//}

    }






