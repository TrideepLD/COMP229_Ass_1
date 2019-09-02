import java.awt.Color;

//Convert to RGB to HSB and Back
public class RGBToHSB {
 
  public static void main(String[] args) {

int red = 31;
 
int green = 57;
 
int blue = 0;
 
// Convert RGB to HSB
 
float[] hsb = Color.RGBtoHSB(red, green, blue, null);
 
float hue = hsb[0];
 
float saturation = hsb[1];
 
float brightness = hsb[2];
 
System.out.println("RGB [" + red + "," + green + "," + blue + "] converted to HSB [" + hue + "," + saturation + "," + brightness + "]" );
 
// Convert HSB to RGB value
 
int rgb = Color.HSBtoRGB(hue, saturation, brightness);
 
red = (rgb>>16)&0xFF;
 
green = (rgb>>8)&0xFF;
 
blue = rgb&0xFF;
 
System.out.println("HSB [" + hue + "," + saturation + "," + brightness + "] converted to RGB [" + red + "," + green + "," + blue + "]" );
 
  }
}