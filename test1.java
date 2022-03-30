import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Abhishek");
		CreateSampleTxtFile();
		DeleteFile();
	}

	public static void method1() {
		List<String> list = new ArrayList<>();

		// add 5 element in ArrayList
		list.add("1");
		list.add("3");
		list.add("9");
		list.add("12");

		// Select a random element from list
		Random randomizer = new Random();
		String random = list.get(randomizer.nextInt(list.size()));
		// randomizer.nextInt(max - min) + min;
		System.out.println(randomizer.nextInt(4));

		System.out.println(random);
	}

	public static void CreateSampleTxtFile() {
		try {
			File filelocator = new File("C:\\Users\\p50043948\\OneDrive - Capita\\Documents\\AutoAppDownload\\" + "SampleTxtFile.txt");
			if (filelocator.createNewFile()) {
				System.out.println("File created: " + filelocator.getName());
			} else {
				filelocator.createNewFile();
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void DeleteFile() {
		try {
			File filelocator = new File("C:\\Users\\p50043948\\OneDrive - Capita\\Documents\\AutoAppDownload\\");

			File[] totalfiles = filelocator.listFiles();

			
			for (File temp : totalfiles) {
				if (temp.getName().equalsIgnoreCase("SampleTxtFile.txt")) {
					// deleting the file after assertion so that next download will not conflict the
					// file name
//					temp.delete();
					break;
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}


}
