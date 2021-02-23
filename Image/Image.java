import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Image {
  private String name;
  private int width;
  private int height;
  private int img[][];
  private String format;

  // CONSTRUCTORS
  public Image(String name, int height, int width) {
    String file[] = name.split("\\.");
    if (file.length == 2) {
      this.name = file[0];
      this.format = file[1];
    } else {
      this.name = name;
      this.format = "p2";
    }
    this.height = height;
    this.width = width;
    img = new int[height][width];
  }

  public Image() {
    this("random100.pgm", 0, 0);
  }

  public Image(Image image) {
    this(image.getName(), image.getHeight(), image.getWidth());
    this.img = image.getImg();
    this.format = image.getFormat();
  }

  // GETTERS
  public int getHeight() {
    return height;
  }

  public String getFormat() {
    return format;
  }

  public int getWidth() {
    return width;
  }

  public String getName() {
    return name;
  }

  public int[][] getImg() {
    return img;
  }

  // SETTERS
  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setName(String name) {
    String file[] = name.split("\\.");
    this.name = file.length > 0 ? file[0] : name;
    this.format = file.length > 0 ? file[1] : "p2";
  }

  public void setImg(int[][] img) {
    this.img = img;
  }

  // METHODS
  public boolean imread(String filename) {
    File file = new File(filename);
    try {
      Scanner fileReader = new Scanner(file);
      if (fileReader.hasNext()) {
        this.format = fileReader.nextLine();
        fileReader.nextLine();
        String[] dimensions = fileReader.nextLine().split(" ");
        height = Integer.parseInt(dimensions[1]);
        width = Integer.parseInt(dimensions[0]);
        img = new int[height][width];
        int i = 0;
        while (fileReader.hasNext() && i < height) {
          String values[] = fileReader.nextLine().split(" ");
          for (int j = 0; j < width; j++) {
            img[i][j] = Integer.parseInt(values[j]);
          }
          ++i;
        }
      }
      fileReader.close();
    } catch (FileNotFoundException f) {
      System.out.println(f.getMessage());
      return false;

    }
    return true;

  }

  public boolean imwrite(String filename) {
    try {
      FileWriter fileWriter = new FileWriter(filename, false);
      fileWriter.write(String.format("%s\n", format));
      fileWriter.write("#Converted from MAP format \n");
      fileWriter.write(String.format("%d %d\n", width, height));
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          fileWriter.write(String.format("%d ", img[i][j]));
        }
        fileWriter.write("\n");
      }
      fileWriter.close();
    } catch (IOException exception) {
      System.out.println(exception.getMessage());
      return false;
    }
    return true;

  }

  @Override
  public String toString() {
    return String.format("filename: %s\n width: %d\n height: %d", name, width, height);
  }
}