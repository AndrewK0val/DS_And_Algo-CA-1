package andrewkoval.jewellerystore.Models;


import andrewkoval.jewellerystore.ADT.DisplayTrayLinkedList;
import andrewkoval.jewellerystore.Driver;

public class DisplayCase {




    private int caseID;
    private String caseType;
    private boolean isCaseLit;

    public DisplayTrayLinkedList trays;


//    public String caseTypeToString(boolean caseType)
//    {
//        if(caseType)
//        {
//            return "Wall Mounted";
//        }
//        return "Free Standing";
//    }


    public DisplayCase(int caseID, String caseType, boolean isCaseLit)
    {
        setCaseID(caseID);
        setCaseType(caseType);
        setIsCaseLit(isCaseLit);

        this.trays = new DisplayTrayLinkedList();
    }




    public void setCaseType(String caseType)
    {
        this.caseType = caseType;
    }


    public String getCaseType()
    {
        return caseType;
    }


    public boolean getIsCaseLit(){
        return isCaseLit;
    }

    public void setIsCaseLit(boolean isCaseLit){
        //not sure if I need validation here
        this.isCaseLit = isCaseLit;
    }


    public String caseLightingBooleanToStringFormat()
    {
    if(isCaseLit==true){
        return "Lit";
    }
    else
    return "Unlit";
    }
    @Override
    public String toString() {
        return
          "Case:  " +caseID + "  |  " + caseType + "   |   " + caseLightingBooleanToStringFormat();
    }

//    public String toString() {
//        return
//                "Case ID=" + caseID + "Case Type" + caseType + "Lighting" + isCaseLit + '\'' +
//                        '}';
//    }



//    public DisplayTray getDsiplayTray()
//    {
//        return displayTray;
//    }
//
//    public void setDisplayTray(DisplayTray displayTray)
//    {
//        this.displayTray = displayTray;
//    }




    public void deleteDisplayTray() {


    }

    public void listDisplayTrays()
    {

    }

    public void setCaseID(int caseID) {
//        for(go through each case){
//                if (new caseID does not match any other ID){
//                    this.caseID = caseID;
//                }
//            }
        this.caseID=caseID;
    }

    public int getCaseID()
    {
        return caseID;
    }



//    public void addDisplayTray()
//    {
////        String id = txtName.getText();
//
//        String trayID = null;
//        String materialColor = null;
//        String dimensions = "";
//
//        DisplayTray dt = new DisplayTray(trayID,materialColor,dimensions);
//       // Driver.displayTrayLinkList.addElement(dt);
//      //  System.out.println(Driver.displayTrayLinkList.head.getContents());
////        newListView.getItems().add(dc);
//
//
//    }

//    public String caseTypeInStringFormat(){
//        if(getCaseType() == true){
//            return "Free Standing";
//        }
//        else
//             return "wall mounted";
//    }


//    while(temp != null)
//    {
//        System.out.println(temp.stuff);
//        temp = temp.next;
//
//    }
//
//    DisplayCase dc = new DisplayCase();
//    dc.next = head;
//    head = dc;



}