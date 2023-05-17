package Util;
import javax.swing.*;
import java.awt.*;

public class IconUtil {
    public static void setWindowIcon(JFrame window) {
    	ImageIcon icon = new ImageIcon("logo.png");
    	window.setIconImage(icon.getImage());
    }
}