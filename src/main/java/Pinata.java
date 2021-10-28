public class Pinata {
    private String type;
    private int hitsRequired;
    private String candyType;
    public Pinata(String type2, int hitsRequired2, String candyType2) {
        type = type2;
        hitsRequired = hitsRequired2;
        candyType = candyType2;
    }
    public String getType() {
        return type;
    }
    public int getHitsLeft() {
        return hitsRequired;
    }
    public String getCandyType() {
        return candyType;
    }
    public void hit() {
        hitsRequired -= 1;
        System.out.println("You hit the "+type+" pinata!");
        if (hitsRequired <= 0) {
            System.out.println("The pinata broke!");
        }
    }
    public void grabCandy() {
        if (hitsRequired <= 0) {
            System.out.println("You grabbed a "+candyType+"!");
        } else {
            System.out.println("You couldn't get candy because the "+type+" pinata is not broken!");
        }
    }

}
