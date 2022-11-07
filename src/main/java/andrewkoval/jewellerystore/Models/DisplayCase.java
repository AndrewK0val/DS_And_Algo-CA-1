package andrewkoval.jewellerystore.Models;


import andrewkoval.jewellerystore.ADT.DisplayTrayLinkedList;
import andrewkoval.jewellerystore.Driver;

public class DisplayCase {


    private String caseID;
    private boolean caseType;
    private boolean isCaseLit;

    DisplayTrayLinkedList trays = new DisplayTrayLinkedList();


    public DisplayCase(String caseID, boolean caseType, boolean isCaseLit)
    {
        setCaseID(caseID);
        setCaseType(caseType);
        setIsCaseLit(isCaseLit);
    }




    public void setCaseType(boolean caseType)
    {
        this.caseType = caseType;
    }


    public boolean getCaseType()
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

    @Override
    public String toString() {
        return "DisplayCase{" +
                "Case ID='" + caseID + "Case Type" + caseType + "Lighting" + isCaseLit + '\'' +
                '}';
    }



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

    public void setCaseID(String caseID) {
//        for(go through each case){
//                if (new caseID does not match any other ID){
//                    this.caseID = caseID;
//                }
//            }
        this.caseID=caseID;
    }

    public String getCaseID()
    {
        return caseID;
    }



    public void addDisplayTray()
    {
//        String id = txtName.getText();

        String trayID = null;
        String materialColor = null;
        int dimensions = 0;

        DisplayTray dt = new DisplayTray(trayID,materialColor,dimensions);
       // Driver.displayTrayLinkList.addElement(dt);
      //  System.out.println(Driver.displayTrayLinkList.head.getContents());
//        newListView.getItems().add(dc);


    }

    public String caseTypeInStringFormat(){
        if(getCaseType()){
            return "Free Standing";
        }
        return "wall mounted";
    }


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