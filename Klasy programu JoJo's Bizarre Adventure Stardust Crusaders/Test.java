public class Test {
    public static void main(String[] args) {
        // Tworzenie postaci z JoJo's Bizarre Adventure: Stardust Crusaders
        Hero Jotaro = new Hero("Jotaro Kujo", "Star Platinum", 100);
        Hero Kakyoin = new Hero("Noriaki Kakyoin", "Hierophant Green", 80);
        Hero Polnareff = new Hero("Jean Pierre Polnareff", "Silver Chariot", 90);
        Hero Dio = new Hero("Dio Brando", "The World", 120);

        Personality jotaroPersonality = new Personality("Serious, stoic");
        Personality kakyoinPersonality = new Personality("Analytical, cautious");
        Personality polnareffPersonality = new Personality("Loyal, hot-headed");
        Personality dioPersonality = new Personality("Manipulative, power-hungry");

        // Wyświetlanie informacji o postaciach
        System.out.println(jotaro);
        System.out.println(jotaroPersonality);

        System.out.println(kakyoin);
        System.out.println(kakyoinPersonality);

        System.out.println(polnareff);
        System.out.println(polnareffPersonality);

        System.out.println(dio);
        System.out.println(dioPersonality);
