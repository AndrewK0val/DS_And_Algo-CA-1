package andrewkoval.jewellerystore.Models;

import andrewkoval.jewellerystore.ADT.JewelleryItemLinkedList;

public class DisplayTray {

    public DisplayTray nextTray;
    public JewelleryItem firstJI;

    private String trayID;
    private String materialColor;
    private String dimensions;

    public JewelleryItemLinkedList items;

    public DisplayTray(String trayID, String materialColor, String dimensions )
    {
    setDimensions(dimensions);
    setTrayID(trayID);
    setMaterialColor(materialColor);

    this.items = new JewelleryItemLinkedList();
    }


    public String getTrayID(){

        return trayID;
    }


    public String getMaterialColor(){
        return materialColor;
    }

    public String getDimensions(){
        return dimensions;
    }



    public void setMaterialColor(String color){
//    dont forget validation
//      if(color.contains(range of colors)) {
          this.materialColor = color;
//      }

    }


    public void setTrayID(String ID){
        // one letter followed by a number e.g. A12
//    if(ID.startsWith(char) && ID.contains(int))
//        {
//            this.trayID = ID;
//        }
        this.trayID = ID;

    }


    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
        //define min and max dimensions for validation
    }


@Override
    public String toString()
    {
    return "ID: " + trayID + "  Material Color: " + materialColor + "Dimensions: " + dimensions;


    }


}