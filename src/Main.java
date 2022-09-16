public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHit(30);
        boss.setBosshealth(700);
        System.out.println("Урон боса " + boss.getBossHit() + "  Здоровье боса " + boss.getBosshealth());
    }
    public class createHeroes {
   public static int[] Hero() {
       TitanHit();
       GnomHit();
       TrolHit();
       String[] Hero = {"Trol", "Gnom", "Titan"};
       return new int[Hero().length];
   }
   }
    private static void TrolHit() {
    }
    private static void GnomHit() {
    }
    private static void TitanHit() {
    }
}