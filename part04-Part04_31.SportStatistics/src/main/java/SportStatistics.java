
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("File:");
        String filename = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(filename))) {
            while (scanner.hasNextLine()) {
                String value = scanner.nextLine();
                String[] splitValue = value.split(",");
                
                String homeTeam = splitValue[0];
                String visitingTeam = splitValue[1];
                int htPoints = Integer.valueOf(splitValue[2]);
                int vtPoints = Integer.valueOf(splitValue[3]);
                
                if (homeTeam.equals(team)) {
                    games++;
                    if (htPoints > vtPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                if (visitingTeam.equals(team)) {
                    games++;
                    if (htPoints < vtPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: "+ losses);
    }

}
