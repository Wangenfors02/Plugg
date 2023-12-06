public class Labb1 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Välkommen till flyggbolaget Patric & Zacke");
        
        int xTim = 10; // Anvångstid sthlm
        int xMin = 10; // Minuter 10:10
          
        int zTim = 14; // Avngångstid New york
        int zMin = 3; // Minuter 14:03
          
        int yTim = 21; // Ankomst tid NY utan tidskillnad 
        int yMin = 28; // Ankomst tid i Minuter NY
          
        int pTim = 17; // Ankomst tid Stockholm utan Tidskillnad
        int pMin = 35; // Ankomst tid i Minuter sthlm
          
        int fTid = 7; // Flygg tid i timmar
        int fmin = 25; // Flyggtid i minuter
          
        int TimTid = 6; // Tidskillnad i timmar
          
          
        System.out.println("Vilken tid anländer flyget från New York i Stocksholm?");
        System.out.println(xTim + fTid + TimTid);
    }
}
    

