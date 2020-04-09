
public class HealthStation {
    
    private int numWeightings;

    public HealthStation() {
        this.numWeightings = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numWeightings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.numWeightings;
    }
}
