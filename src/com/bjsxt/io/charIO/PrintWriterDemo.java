package com.bjsxt.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("d:/aaa.txt"),true);
		PrintWriter print = new PrintWriter(fw);
//		print.append("1111123");
//		print.flush();
		print.println("12121");
		
		print.close();
	}
}
