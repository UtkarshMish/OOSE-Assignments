public class DistanceSensor {
  private String id;
  private double range;
  private double MAX_RANGE;
  private double MIN_RANGE;

  public void setId(String id) {
    this.id = id;
  }

  public void setRange(double range) {
    if (range >= MIN_RANGE && range <= MAX_RANGE)
      this.range = range;
    else
      throw new IllegalArgumentException("Range should be in between MAX and MIN ranges.");
  }

  public void setMaxRange(double MAX_RANGE) {
    this.MAX_RANGE = MAX_RANGE;
  }

  public void setMinRange(double MIN_RANGE) {
    this.MIN_RANGE = MIN_RANGE;
  }

  public DistanceSensor(String id) {
    this(id, 0.2, 5.0, 0.2);
  }

  public String getId() {
    return id;
  }

  public double getRange() {
    return range;
  }

  public double getMaxRange() {
    return MAX_RANGE;
  }

  public double getMinRange() {
    return MIN_RANGE;
  }

  public DistanceSensor(DistanceSensor dSensor) {
    this(dSensor.getId(), dSensor.getRange(), dSensor.getMaxRange(), dSensor.getMinRange());
  }

  public DistanceSensor(String id, double range, double MAX_RANGE, double MIN_RANGE) {
    this.id = id;
    if (range <= MAX_RANGE && range >= MIN_RANGE)
      this.range = range;
    else
      throw new IllegalArgumentException("Range should be in between MAX and MIN ranges.");
    this.MAX_RANGE = MAX_RANGE;
    this.MIN_RANGE = MIN_RANGE;
  }

  @Override
  public String toString() {
    return String.format("{\"id\":\"%s\", \"range\":\"%d\", “MAX_RANGE”:”%d”, “MIN_RANGE”:”%d”}", id, range, MAX_RANGE,
        MIN_RANGE);
  }
}