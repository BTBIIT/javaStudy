package drawing;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class logo {

    public static void main(String[] args) {
        int width = 600; // 이미지 너비
        int height = 400; // 이미지 높이

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();

        // Set background color
        g.setColor(new Color(255, 255, 204));
        g.fillRect(0, 0, width, height);

        // Draw burger bun
        g.setColor(new Color(255, 204, 102));
        g.fillRoundRect(150, 150, 300, 100, 50, 50); // Top bun
        g.fillRoundRect(150, 250, 300, 100, 50, 50); // Bottom bun

        // Draw burger patty
        g.setColor(new Color(153, 102, 51));
        g.fillRect(200, 250, 200, 50);

        // Draw lettuce
        g.setColor(new Color(51, 153, 0));
        g.fillOval(230, 190, 140, 60);

        // Draw tomato
        g.setColor(new Color(255, 51, 51));
        g.fillOval(300, 260, 80, 60);

        // Draw cheese
        g.setColor(new Color(255, 204, 0));
        g.fillRoundRect(200, 250, 200, 15, 20, 20);

        // Draw flag
        g.setColor(new Color(0, 0, 255));
        g.fillRect(470, 150, 20, 200); // Flag pole
        g.setColor(new Color(255, 0, 0));
        g.fillRect(470, 150, 120, 60); // Flag (red)
        g.setColor(new Color(255, 255, 255));
        g.fillRect(470, 210, 120, 60); // Flag (white)
        g.setColor(new Color(0, 0, 255));
        g.fillRect(470, 270, 120, 60); // Flag (blue)

        // Add restaurant name
        g.setColor(new Color(51, 51, 51));
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        String text = "KOTTE RIA";
        int textWidth = g.getFontMetrics().stringWidth(text);
        g.drawString(text, (width - textWidth) / 2, 350);

        // Save image to the specified directory
        String filePath = "C:\\Users\\kosmo\\Downloads\\logo.png";
        File output = new File(filePath);
        try {
            ImageIO.write(image, "png", output);
            System.out.println("Image saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save the image: " + e.getMessage());
        }

        g.dispose();
    }
}
