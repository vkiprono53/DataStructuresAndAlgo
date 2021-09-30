public class Horse extends Animal{
    public String color;
    public void neigh(){
        System.out.println("neigh----");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setColor("Brown");
        horse.eat();
        System.out.println(horse.getColor());
    }
}
