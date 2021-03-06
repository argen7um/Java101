package wednesday.imageoperations;

import java.io.File;

import wednesday.imageoperations.components.Matrix;
import wednesday.imageoperations.imageprocessing.BrightnessReduce;
import wednesday.imageoperations.imageprocessing.Grayscale;

public class ImageEffectsCreator {

	public static void main(String[] args) {

		 Matrix brightnessEffect = new Matrix(new File("src/images/lego.jpg"),
		 "BrightLegoPic");
		 brightnessEffect.operate(new BrightnessReduce());
		
		 Matrix grayscale = new Matrix(new File("src/images/lego.jpg"), "GrayLegoPic");
		 grayscale.operate(new Grayscale());
//
//		Matrix gaussianBlur = new Matrix(new File("lego.jpg"), "GaussianLegoPic");
//		 gaussianBlur.operate(new GaussianBlur());
	}
}
