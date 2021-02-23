public class ImageTest {
  public static void main(String[] args) {
    Image image = new Image("quiz01_image01.pgm", 20, 30);
    int img[][] = new int[image.getHeight()][image.getWidth()];
    for (int i = 0; i < image.getHeight(); i++) {
      for (int j = 0; j < image.getWidth(); j++) {
        img[i][j] = (int) Math.round(Math.random() * 100);
      }
    }
    image.setImg(img);
    image.imwrite(image.getName() + "." + image.getFormat());

    Image image2 = new Image();
    Image image3 = new Image(image);
    image3.setName("quiz01_image03.pgm");
    image3.imwrite("quiz01_image03.pgm");

    image2.setWidth(20);
    image2.setHeight(10);
    image2.setName("quiz01_image02.pgm");
    image2.setImg(img);
    image2.imwrite(image2.getName() + "." + image2.getFormat());
    System.out.printf("%s\n %s\n %s", image, image2, image3);
  }
}
