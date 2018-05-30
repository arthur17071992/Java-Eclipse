import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writeToFile();
		readFromFile();
	}
	public static void writeToFile() throws IOException
	{
		// create binary file
		FileOutputStream outStream = new FileOutputStream("Arthur Nguyen.dat");
		DataOutputStream outputFile = new DataOutputStream(outStream);
		// set the output value & print output
		System.out.println("Starting to write to file");
		outputFile.writeInt(5);
		outputFile.writeDouble(9.95);
		System.out.println("Finished writing to file\n");
		outputFile.close();
	}//end method writeToFile
	
	public static void readFromFile() throws IOException
	{
		// read the binary file
		FileInputStream inStream = new FileInputStream("Arthur Nguyen.dat");
		DataInputStream inputFile = new DataInputStream(inStream);
		// initialize value & print new output on console
		int fileInt = 0;
		double fileDbl = 0.0;
		System.out.println("Starting to read file");
		fileInt = inputFile.readInt();
		System.out.print(fileInt + " ");
		fileDbl = inputFile.readDouble();
		System.out.println(fileDbl);
		inputFile.close();
		System.out.println("Finished reading from file");
	}//end method readFromFile

}
