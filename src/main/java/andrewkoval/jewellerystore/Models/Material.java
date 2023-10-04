package andrewkoval.jewellerystore.Models;

public class Material {
    private String material;
    private int weightInGrams;
    private String quality;

    public Material(String material, int weightInGrams, String quality)
    {
    setMaterial(material);
    setQuality(quality);
    setWeightInGrams(weightInGrams);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Material: " + material + "    |   " + "Weight:  " + weightInGrams + "g    |    "  + quality + "karat" ;
    }
}
