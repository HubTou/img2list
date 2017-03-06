import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

public class img2list
{
        public static void main(String[] args)
        {
                if (args.length != 1)
                {
                        System.out.println("Usage: <image filename>");
                        System.exit(1);
                }

                System.out.println("// Processing " + args[0]);

                Path file = Paths.get(args[0]);
                if (! Files.exists(file))
                {
                        System.out.println("img2list: ERROR. File " + file + " doesn't exist!");
                        System.exit(2);
                }

                try
                {
                        BufferedImage image = ImageIO.read(new File(file.toString()));

                        if (image == null)
                        {
                                System.out.println("img2list: ERROR. File " + file + " doesn't seem to be a picture!!");
                                System.exit(3);
                        }

                        int width  = image.getWidth();
                        int height = image.getHeight();

                        System.out.println("// " + file + " is " + width + " pixels wide by " + height + " pixels high.");

                        System.out.println("//x:y:red:green:blue");
                        for (int x=0; x < width; x++)
                                for (int y=0; y < height; y++)
                                {
                                        Color colour = new Color(image.getRGB(x,y));
                                        int r = colour.getRed();
                                        int g = colour.getGreen();
                                        int b = colour.getBlue();

                                        System.out.println(x + ":" + y + ":" + r + ":" + g + ":" + b);
                                }

                }
                catch (IOException e)
                {
                        System.out.println("img2list: ERROR. Got an exception reading file " + file + "!");
                        e.printStackTrace();
                        System.exit(4);
                }

                System.exit(0);
        }
}
