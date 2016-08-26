package helloworld;

import java.io.*;

public class hello {

	public hello() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {

			// String prg = "import sys\nprint
			// int(sys.argv[1])+int(sys.argv[2])\n";
			// BufferedWriter out = new BufferedWriter(new
			// FileWriter("test1.py"));
			// out.write(prg);
			// out.close();

			String s = "Vipin";
			int number1 = 564;
			int number2 = 32;

			ProcessBuilder pb = new ProcessBuilder("python", "test1.py", ""+s,"");
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			// int ret = new Integer(in.readLine()).intValue();
			System.out.println("value is : " + in.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}