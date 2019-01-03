package Commond;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;

public class ScreenShotHelper {

	/*
	 * Take Screenshot to File. The Element Error will be highlight automatically
	 * Input: The WebElement for assertion 
	 */
	public File TakesScreenShot(WebElement element) throws IOException
	{
		WrapsDriver wrapsDriver = (WrapsDriver) element;
		File screenShot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
		//Draw element border
		int elX =element.getLocation().x;
		int elY = element.getLocation().y;
		int elW = element.getSize().width;
		int elH = element.getSize().height;
		//Bufferred image to draw
		BufferedImage bufImg = ImageIO.read(screenShot);
		//Create Graphic to fraw
		Graphics2D graph = (Graphics2D) bufImg.getGraphics();
		//Create boder
		Stroke oldStroke = graph.getStroke();
	    graph.setColor(Color.red);
	    graph.setStroke(new BasicStroke(2)); //2 is border width
	    
	    graph.drawRect(elX, elY, elW, elH);
	    graph.setStroke(oldStroke);

	    ImageIO.write(bufImg, "png", screenShot);
	    
		return screenShot;
	}
	
	/*
	 * Take Screenshot and convert it to byte. It may be used to embedded to test report
	 * Input: The Assertion Element. This Element is highlight automatically on red border
	 */
	public byte[] GetScreenShotByte(WebElement element) throws IOException
	{
		File scrFile = TakesScreenShot(element);
		byte[] data = FileUtils.readFileToByteArray(scrFile);
		return data;
	}
	
	/*
	 * Take ScreenShot and save it to external file.
	 * Input: The Assertion Element. This Element is highlight automatically in red border.
	 */
	public void TakesScreenShot(WebElement element, String path) throws IOException
	{
		File outputFile = new File(path);
		FileUtils.copyFile(this.TakesScreenShot(element), outputFile);
	}
	
	/*
	 * Take Screenshot and Crop the Assertion Element only
	 * Input: The Assertion Element. It will be automatically cropped.
	 */
	public File TakesCropScreenShot(WebElement element) throws IOException
	{
		WrapsDriver wrapsDriver = (WrapsDriver) element;
		File screenShot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
		//Draw element border
		int elX =element.getLocation().x;
		int elY = element.getLocation().y;
		int elW = element.getSize().width;
		int elH = element.getSize().height;
		
		BufferedImage bufferedImage = ImageIO.read(screenShot);
		
		BufferedImage croppedImage = bufferedImage.getSubimage(elX, elY, elW, elH);
		ImageIO.write(croppedImage, "png", screenShot);
		
		return screenShot;
	}
	
	/*
	 * Take Screenshot and Crop the Assertion Element to Byte
	 * Input: The Assertion Element. It will be automatically cropped.
	 */
	public byte[] GetCropScreenShotByte(WebElement element) throws IOException
	{
		File scrFile = TakesCropScreenShot(element);
		byte[] data = FileUtils.readFileToByteArray(scrFile);
		return data;
	}
	
	/*
	 * Take Screenshot and Crop the Assertion Element to External File
	 * Input: The Assertion Element. It will be automatically cropped.
	 */
	public void TakesCropScreenShot(WebElement element, String path) throws IOException
	{
		File outputFile = new File(path);
		FileUtils.copyFile(this.TakesCropScreenShot(element), outputFile);
	}
}
