public class ParkingLot {
  private int numCars;
  public final int MAX_CARS = 2500;

  public ParkingLot() {
    numCars = 0;
  }

  public ParkingLot(int initnumCars) {
    numCars = initnumCars;
  }

  public int getNumCars() {
    return numCars;
  }

  public void setNumCars (int theNumCars) {
    if (theNumCars >= 0 && theNumCars <= MAX_CARS)
    numCars = theNumCars;
  }

  public String toString() {
    return "Number of cars is " + numCars;
  }

  public boolean equals(Object other) {
    ParkingLot p = (ParkingLot)other;
      if (p.numCars == this.numCars) {
        return true;
      }else {
        return false;
      }
  }
}
