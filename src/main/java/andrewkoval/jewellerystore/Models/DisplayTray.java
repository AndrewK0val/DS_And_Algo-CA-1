package andrewkoval.jewellerystore.Models;

public class DisplayTray {

    public DisplayTray nextTray;
    public JewelleryItem firstJI;

    private String trayID;
    private String materialColor;
    private int dimensions;

    public DisplayTray(String trayID, String materialColor, int dimensions )
    {

    }


    public String getTrayID(){

        return trayID;
    }


    public String getMaterialColor(){
        return materialColor;
    }

    public int getDimensions(){
        return dimensions;
    }



    public void setMaterialColor(String color){
//    dont forget validation
//      if(color.contains(range of colors)) {
//          this.materialColor = color;
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


    public void setDimensions(int dimensions){
        this.dimensions = dimensions;
        //define min and max dimensions for validation
    }



}