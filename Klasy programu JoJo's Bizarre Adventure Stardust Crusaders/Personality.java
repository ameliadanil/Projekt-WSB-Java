// Klasa Personality
public class Personality {
    private String traits;

    public Personality(String traits) {
        this.traits = traits;
    }

    // Gettery i Settery

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "traits='" + traits + '\'' +
                '}';
    }
}
