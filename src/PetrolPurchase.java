public class PetrolPurchase {
    
    private String location;
    private String petrolType;
    private int quantity;
    private double priceperlitre;
    private double percetagediscount;

    public void setLocation(String loc)
    {
        this.location = loc;
    }

    public void setPetrolType(String petty)
    {
        this.petrolType = petty;
    }

    public void setpricePerLitre(double ppl)
    {
        this.priceperlitre = ppl;

    } 

    public void setPercentageDiscount(double pd)
    {
        this.percetagediscount = pd;
    }

    public String getLocation()
    {
        return this.location;
    }

    public String getPetrolType()
    {
        return this.petrolType;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getPricePerLitre()
    {
        return this.priceperlitre;
    }

    public double getPerentageDiscount()
    {
        return this.percetagediscount;
    }
}

 class PetrolPurchaseInfo
{
    public void main(String args[])
    {
        
    }


}

