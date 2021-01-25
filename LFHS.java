public class LFHS {
  private int numCars;
  public final int MAX_CARS = 400

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

  public ParkingLot fillLot() {
    ParkingLot p = (ParkingLot)other;
    while (p <= 400) {
      p++;
    }
  }
}

