// Zacharias Andersson och Patric Wangenfors

import java.util.Scanner; // importerar scaner

// Main classen som användas för att skapa metoden
class Main {
static void WCTMetod(){// Här skapas metoden som används för att skriva ut välkommst meddelandet
    System.out.println("Välkommen till vårt program som handlar om Wind Chill Tempratur!");
}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Skapar objektet "input" med scanner 1 för att spara användarens input i programmet. 
        int i = 0; // Här skapas variabeln i som används för while loopen
while (i != 2) { // Här skapas en while loop som går igenom programet så länge i inte är lika med 2


        WCTMetod(); // Här anroppars metoden
        System.out.println(); 

        System.out.println("Var vänlig skriv in utetemperaturen i Celcius\n");
        String UteTemperatur = input.nextLine(); // Tar emot användarens input och sparar det i en variabel "UteTempratur"

        System.out.println("Var vänlig skriv in vindhastigeheten i km/h.\n");
        String VindHastighetKms = input.nextLine(); // Tar emot användarens input km/s vind

        double UteTemp = Double.parseDouble(UteTemperatur); // Konverterar från string till en double, double är en typ av data typ som hanterar tal med decimaler
        double VindHastKms = Double.parseDouble(VindHastighetKms);

        double wtc = 13.12 + 0.6215 * UteTemp - 11.37 * Math.pow(VindHastKms, 0.16) + 0.3965 * UteTemp * Math.pow(VindHastKms, 0.16);

        // Här görs en utskrift och %.1f används för att avgöra hur många decimaler som skrivs ut
        System.out.printf("Enligt vår utträkning känns det som %.1f Men är bara %.1f celcius utomhus ", wtc, UteTemp);
        
        // Här skapas variablerna som används för if loopen
       int StorRisk = -60;
       int Risk = -35;
       int Kallt = -25;
      
       // Här skapas en nästlad if loop med if och if else som efterfrågat i uppgifts beskrivningen 
        if (StorRisk > wtc ) {
        System.out.println("Stor risk för frostskada");
        } else if (Risk >= wtc){
            System.out.println("Risk för frostskada");
        } else if (Kallt >= wtc){
            System.out.println("Mycket kallt");
        } else if (Kallt > wtc){
            System.out.println("Kallt");
        }

        System.out.println();
        System.out.println("Om du vill avsluta tryck 2 annars tryck 1"); // Här får man chansen att välja om man vill fortsätta eller avsluta
        String Avslut = input.nextLine();
        i = Integer.parseInt(Avslut); // Här parsas I in till Avslut
        }
    }
}