package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		if (shape.equals("rectangle")) {
			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
			Boolean filled = in.nextBoolean();
				if (filled == true) {
					StdDraw.filledRectangle(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
				}	
				else {
					StdDraw.rectangle(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
				}
		}
		else if (shape.equals("ellipse")) {
			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
			Boolean filled = in.nextBoolean();
			if (filled == true) {
				StdDraw.filledEllipse(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
			}	
			else {
				StdDraw.ellipse(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		else  {
			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
			Boolean filled = in.nextBoolean();
			if (filled == true) {
				double[] array = {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()};
				double[] arrayy = {array[1], array[3], array[5]};
				double[] arrayx = {array[0], array[2], array[4]};
				StdDraw.filledPolygon(arrayx, arrayy);
			}		
			else {
				double[] array = {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()};
				double[] arrayy = {array[1], array[3], array[5]};
				double[] arrayx = {array[0], array[2], array[4]};
				StdDraw.polygon(arrayx, arrayy);
			}
			
		}
			
		
	}
}
