public class SensorGrid {
  private DistanceSensor sensors[][];
  private double gridLength;
  private double gridWidth;

  // CONSTRUCTORS
  public SensorGrid() {
    this(new DistanceSensor[0][0], 0, 0);
  }

  public SensorGrid(SensorGrid sensorGrid) {
    this(sensorGrid.getSensors(), sensorGrid.getGridLength(), sensorGrid.getGridWidth());
  }

  public SensorGrid(DistanceSensor[][] sensors, double gridLength, double gridWidth) {
    this.sensors = sensors;
    this.gridLength = gridLength;
    this.gridWidth = gridWidth;
  }

  // GETTERS and Setters
  public DistanceSensor[][] getSensors() {
    return sensors;
  }

  public void setSensors(DistanceSensor[][] sensors) {
    this.sensors = sensors;
  }

  public double getGridLength() {
    return gridLength;
  }

  public void setGridLength(double gridLength) {
    this.gridLength = gridLength;
  }

  public double getGridWidth() {
    return gridWidth;
  }

  public void setGridWidth(double gridWidth) {
    this.gridWidth = gridWidth;
  }

  // METHODS
  public void add(DistanceSensor s, int i, int j) {
    if (i >= 0 && i <= gridLength && j >= 0 && j <= gridWidth)
      sensors[i][j] = s;
    else
      throw new IllegalArgumentException("i and j should be less than or equal to grid length and width");
  }

  public void remove(int i, int j) {
    if (i > 0 && i < gridLength && j > 0 && j < gridWidth)
      sensors[i][j] = null;
    else
      throw new IllegalArgumentException("i and j should be less than grid length and width");
  }

  public double max() {
    double maxValue = sensors[0][0].getRange();
    for (int i = 0; i < gridLength; i++) {
      for (int j = 0; j < gridWidth; j++) {
        if (maxValue < sensors[i][j].getRange())
          maxValue = sensors[i][j].getRange();
      }
    }
    return maxValue;
  }
}
