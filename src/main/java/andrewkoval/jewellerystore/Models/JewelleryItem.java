package andrewkoval.jewellerystore.Models;

public class JewelleryItem {

    private String name;
    private String type;
    private String targetGender;
    private String imageURL;
    private float retailPrice;

    //    name, description, type (ring, watch, necklace, etc. ), target gender, image(url), retail price
    public JewelleryItem()
    {



    }


    public String getName()
    {
        return name;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setTargetGender()
    {

    }

}
