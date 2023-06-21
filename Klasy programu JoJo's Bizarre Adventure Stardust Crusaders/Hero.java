// Klasa Hero
public class Hero {
    private String name;
    private String abilities;
    private int strength;

    public Hero(String name, String abilities, int strength) {
        this.name = name;
        this.abilities = abilities;
        this.strength = strength;
    }

    // Gettery i Settery

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", abilities='" + abilities + '\'' +
                ", strength=" + strength +
                '}';
    }
}
