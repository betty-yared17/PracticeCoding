public abstract class Animal implements comparable<Animal> {
    protected int weight;
    protected String type;
    private static int count = 0; //counter to track number of animals

    public Animal (int weight, String type){
        this.weight = weight;
        this.type = type;
        count ++; //increment the count for every new animal created
    }

    public int getWeight(){ //getter to get the weight
        return weight;
    }

    public String getType(){ //getter for type
        return type;
    }

    public static int getCount(){ //getter to return the number of animals (count)
        return count;
    }

    public int compareTo(Other Animal){
        return integer.compare (Other.weight, this.weight);
    }

    public String toString(){
        return "Weight =" + weight + "Type:" + type;
    }
}


    public class Tiger extends Animal {
        private String furColor;
    

    public Tiger (int Weight, String furColor) {
        super(Weight, "Tiger");
        this.furColor = furColor;
    }

    public String toString(){
        return super.toString() + ", Fur Color: " + furColor;
    }
}

    public class Fish extends Animal{
        private int numFins;

    public Fish (int Weight, int numFins){
        super(Weight, "Fish");
        this.numFins = numFins;
        }
    
    public String toString(){
        return super.toString() + ", Number of Fins: " + numFins;
        }
    }
    
    



	