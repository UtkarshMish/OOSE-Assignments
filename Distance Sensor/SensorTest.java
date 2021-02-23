public class SensorTest {
  public static void main(String[] args) {
    int gridLength = 3;
    int gridWidth = 3;
    SensorGrid grid = new SensorGrid(new DistanceSensor[gridLength][gridWidth], gridLength, gridWidth);
    for (int i = 0; i < gridLength; i++) {
      for (int j = 0; j < gridWidth; j++) {
        DistanceSensor sensor = new DistanceSensor(Integer.toString(i + j + 1));
        sensor.setMaxRange(5.0);
        double randomRange = (Math.random() * 10) % 5.0;
        randomRange = randomRange > 0.2 ? randomRange : 0.2;
        sensor.setRange(randomRange);
        grid.add(sensor, i, j);
      }
    }
    System.out.printf("%.2f", grid.max());
  }
}
