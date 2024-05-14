package objectOrientation.UltraEmojiCombat;


public class Fighter {

    public enum Category {
        LIGHT,
        MEDIUM,
        HEAVY
    }

    public enum Nationality {
        BRAZIL,
        ITALY,
        FRANCE,
        EUA,
        JAPAN
    };

    private String name;
    private short age;
    private float weight;
    private float height;



    private Category category;
    private Nationality nationality;
    
    private short wins;
    private short draws;
    private short loses;

    public Fighter(String name, Nationality nationality, short age, float weight, float height, short wins, short draws, short loses) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.wins = wins;
        this.draws = draws;
        this.loses = loses;
        this.setCategory(this.weight);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public Category getCategory(){
        return this.category;
    }
    public void setCategory(float weight){
        if(weight > 60 && weight < 80){
            this.category = Category.LIGHT;
        }
    }
    public short getWins() {
        return wins;
    }
    public void setWins(short wins) {
        this.wins = wins;
    }
    public short getDraws() {
        return draws;
    }
    public void setDraws(short draws) {
        this.draws = draws;
    }
    public short getLoses() {
        return loses;
    }
    public void setLoses(short loses) {
        this.loses = loses;
    }

    public void show(){
        System.out.println("=====================");
        System.out.printf("=====%s", this.getName()+"=====");
        System.out.println("\n=====================");
        System.out.printf("\nFROM %s \n", this.nationality);
        System.out.printf("Weight: %.2f \n", this.getWeight());
        System.out.printf("Height: %.2f \n", this.getHeight());
        System.out.printf("Age: %d \n", this.getAge());
    }
    public void status(){
        System.out.printf("Wins: %d \n", this.getWins());
        System.out.printf("Draws: %d \n", this.getDraws());
        System.out.printf("Loses: %d \n", this.getLoses());
    }
    public void win(){
        this.setWins((short)(this.wins + 1));
    }

    public void draw(){
        this.setDraws((short)(this.draws + 1));
    }

    public void lose(){
        this.setLoses((short)(this.loses + 1));
    }
    

}
