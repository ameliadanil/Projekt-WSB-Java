// Klasa Test
public class Test {
    public static void main(String[] args) {
        // Tworzenie postaci z JoJo's Bizarre Adventure: Stardust Crusaders
        Hero Jotaro = new Hero("Jotaro Kujo", "Star Platinum", 100);
        Hero Kakyoin = new Hero("Noriaki Kakyoin", "Hierophant Green", 80);
        Hero Polnareff = new Hero("Jean Pierre Polnareff", "Silver Chariot", 90);
        Hero Dio = new Hero("Dio Brando", "The World", 120);

        Personality JotaroPersonality = new Personality("Serious, stoic");
        Personality KakyoinPersonality = new Personality("Analytical, cautious");
        Personality PolnareffPersonality = new Personality("Loyal, hot-headed");
        Personality DioPersonality = new Personality("Manipulative, power-hungry");

        // Wyświetlanie informacji o postaciach
        System.out.println(Jotaro);
        System.out.println(JotaroPersonality);

        System.out.println(Kakyoin);
        System.out.println(KakyoinPersonality);

        System.out.println(Polnareff);
        System.out.println(PolnareffPersonality);

        System.out.println(Dio);
        System.out.println(DioPersonality);
