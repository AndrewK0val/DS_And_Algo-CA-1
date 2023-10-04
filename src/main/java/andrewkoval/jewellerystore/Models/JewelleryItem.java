package andrewkoval.jewellerystore.Models;

import andrewkoval.jewellerystore.ADT.JewelleryItemMaterialLinkedList;

public class JewelleryItem {
    private String imageURL, targetGender, type, brandName, description;
    private float retailPrice;

    private int quantity;

    public JewelleryItemMaterialLinkedList materials;
    //    name, description, type (ring, watch, necklace, etc. ), target gender, image(url), retail price
    public JewelleryItem(String name, String description, String type, String imageURL, float retailPrice, String targetGender, int quantity) {
        setName(name);
        setDescription(description);
        setType(type);
        setTargetGender(targetGender);
        setImageURL(imageURL);
        setRetailPrice(retailPrice);
        setTargetGender(targetGender);
        setQuantity(quantity);

        this.materials = new JewelleryItemMaterialLinkedList();
    }

    public String getName()
    {
        return brandName;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public  String getType()
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
        this.brandName = name;
    }

    public void setTargetGender(String targetGender)
    {
//        if (targetGender = "male" || "female" || "unisex"){
            this.targetGender = targetGender;
//        }
    }

    public void limitDescLenghtTo100Chars()
    {

    }


    public String toString()
    {
    return
    brandName + "  " + type + "    |    "  + targetGender + "  |   €" + retailPrice + "  |   URL: " + imageURL +"  |  Quantity" + quantity +"\n " + description;

    }



}
