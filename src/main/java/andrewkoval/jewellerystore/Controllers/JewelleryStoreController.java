package andrewkoval.jewellerystore.Controllers;

import andrewkoval.jewellerystore.Driver;
import andrewkoval.jewellerystore.Models.DisplayCase;
import andrewkoval.jewellerystore.Models.DisplayTray;
import andrewkoval.jewellerystore.Models.JewelleryItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

//import com.thoughtworks.xstream;
//import com.thoughtworks.xstream.security.AnyTypePermission;
//import javafx.collections.FXCollections;
//import com.thoughtworks.xstream.io.xml.DomDriver;
import javafx.scene.layout.AnchorPane;


public class JewelleryStoreController implements Initializable {
        @FXML
        private AnchorPane overviewItemMenu;
        public DisplayCase displayCase;

        public DisplayTray displayTray;

        public JewelleryItem jewelleryItem;


        @FXML
        private TextField txtID, searchStock, displayTrayIdInput, JewelleryItemPriceInput, JewelleryItemImageUrlInput, JewelleryItemNameInput, JewelleryItemQuantityInput;
        @FXML
        private ComboBox lightingSelection, caseTypeSelection, displayTrayMatColourComboBox, displayTrayDimensionsComboBox, JewelleryItemTypeComboBox, JewelleryItemTargetGenderComboBox ;

        @FXML
        private ListView<DisplayCase> newListView;
//    String[] n = {"dnkmm","bhedfvuhj", "bdjvb"};






        // public DisplayCase next = null;

        // public DisplayCase head;

        // DisplayCase temp=head;

//public void initialize()
//{
//    lightingSelection.getItems().addAll("Lit", "Unlit");
//    caseTypeSelection.getItems().addAll("Free Standing", "Wall mounted");
//}


        public void addDisplayCase()
        {
            String id = txtID.getText();
            String lit = lightingSelection.getSelectionModel().getSelectedItem().toString();
            boolean isLit=false;
            if (lit.equals("Lit"))
            {
                isLit=true;
            }

            String type = caseTypeSelection.getSelectionModel().getSelectedItem().toString();
            boolean isType=false;
            if(type.equals("Wall Mounted"))
            {
                isType=true;
            }


            DisplayCase dc = new DisplayCase(id,isType,isLit);
            Driver.displayCaseLinkList.addElement(dc);
            System.out.println(Driver.displayCaseLinkList.head.getContents());
            Driver.displayCaseLinkList.addToListView(newListView);
        }



        public String DisplayCaseType(){
            if(displayCase.getCaseType())
            {
                return "Wall Mounted";
            }
            return "Free Standing";
        }


    /*while(temp != null) {
        temp = temp.next;

    }*/

        public void addDisplayTray()
        {



        }


        public void addJewelleryItem()
        {



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


        public void deleteDisplayTray()
        {


        }


        public void deleteDisplayCase()
        {


        }


        public void displayJewelleryItem()
        {



        }


        public void listItemsInDisplayTray()
        {


        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
//        newListView.getItems().addAll(n);
            lightingSelection.getItems().addAll("Lit", "Unlit");
            caseTypeSelection.getItems().addAll("Free Standing", "Wall mounted");
            txtID.getText();
            overviewItemMenu.setVisible(false);
        }




//        public void save() throws Exception {
//            XStream xstream = new XStream(new DomDriver());
//            ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("displayCases.xml"));
//            out.writeObject(displayCase);
//            out.close();
//
//            ObjectOutputStream out2 = xstream.createObjectOutputStream(new FileWriter("displayTrays.xml"));
//            out.writeObject(displayTray);
//            out.close();
//
//            ObjectOutputStream out3 = xstream.createObjectOutputStream(new FileWriter("JewelleryItems.xml"));
//            out.writeObject(jewelleryItem);
//            out.close();
//
//            //dont forget to include material
//
//        }
//
//
//
//        @SuppressWarnings("unchecked")
//        public void load() throws Exception {
//            //setting up the xstream object with default security and the above classes
//            XStream xstream = new XStream(new DomDriver());
//           // XStream.setupDefaultSecurity(xstream);
//
//            // Not sure if I should have this, no idea how security works in xstream
//            //xstream.allowTypes(classes);
////        xstream.addPermission(AnyTypePermission.ANY);
//
//            //doing the actual serialisation to an XML file
//            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("displayCase.xml"));
//
//
//
//            is.close();
//        }


        public void valueStockInOverview(ActionEvent actionEvent) {
        }

        public void selectfromOverview(ActionEvent actionEvent) {
        }
    }


