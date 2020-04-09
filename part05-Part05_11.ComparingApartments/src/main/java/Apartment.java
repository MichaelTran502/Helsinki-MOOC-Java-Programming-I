
import java.lang.*;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }
    
    
    public boolean largerThan(Apartment compared) {
        
        if (this.squares > compared.getSquares()) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.squares*this.princePerSquare - 
                compared.getSquares()*compared.getPrincePerSquare());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        
        if (this.squares*this.princePerSquare > 
                compared.getSquares()*compared.getPrincePerSquare()) {
            return true;
        }
        
        return false;
    }
}
