package andrewkoval.jewellerystore.Models;

import andrewkoval.jewellerystore.ADT.JewelleryItemMaterialLinkedList;

public class JewelleryItem {
    private String imageURL, targetGender, type, name, description;
    private float retailPrice;
    private int quantity;
    public JewelleryItemMaterialLinkedList materials;
    //    name, description, type (ring, watch, necklace, etc. ), target gender, image(url), retail price
    public JewelleryItem(String name, String description, String type, String imageURL, float retailPrice, String targetGender) {
        setName(name);
        setDescription(description);
        setType(type);
        setTargetGender(targetGender);
        setImageURL(imageURL);
        setRetailPrice(retailPrice);
        setTargetGender(targetGender);

        this.materials = new JewelleryItemMaterialLinkedList();
    }


    public String getName()
    {
        return name;

    }


    public String getTargetGender()
    {
        return targetGender;
    }

    public String getImageURL()
    {
    return imageURL;
    }

    public float getRetailPrice()
    {
        return retailPrice;
    }

    public String getDescription()
    {
    return description;
    }

    public  String getTypeO()
    {
    return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTargetGender(String targetGender)
    {
//        if (targetGender = "male" || "female" || "unisex"){
            this.targetGender = targetGender;
//        }
    }


    public String toString()
    {
    return"                 "+ name + "         " + type + "            "  + targetGender + "        " + retailPrice + "         " + imageURL;

    }



}
