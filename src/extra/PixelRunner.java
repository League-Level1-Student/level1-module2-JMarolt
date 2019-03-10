package extra;

public class PixelRunner {

	public static void main(String[] args) {

		PixelParty party = new PixelParty();

		party.setColor(255, 0, 0);

		party.getRandomColor();

		party.drawRectangle(100, 100, 100, 100);

		party.drawTriangle(100, 100, 150, 150, 100, 150);

		party.saveImage();

		party.displayImage();

	}

}
