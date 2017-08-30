package com.data.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Change {
	static String[] segments = null;

	public static void main(String[] args) throws IOException {
		String inputfilename = "E://SVNhere//IOTest//New//New.dat";
		String outputfilename = "E://data1//New.dat";
		readFileByLines(inputfilename, "379625466", "djfadasjh", outputfilename);

	}

	public static void readFileByLines(String fileName,String uin,String skey,String des_filename) {
		File file = new File(fileName);
		BufferedReader reader = null;
		ArrayList<String> arr_str = new ArrayList<String>();
		try {
			System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String tempString ;
			int line = 1;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null) {
				// ��ʾ�к�
				System.out.println("line " + line + ": " + tempString);
				arr_str.add(changedString(tempString, "uin", uin,"skey",skey));// �ı��ӦId����ֵ	
				line++;
			}
			//buildDataFile("E://data1//New.dat", arr_str);
			buildDataFile(des_filename, arr_str);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static String changedString(String singleline, String id, String content,String id1, String content1) {
		String data_wait_change = singleline;
		String str_result = "" ;
		segments = data_wait_change.split("\t"); // ��tab�ָ�
		int seg_length = segments.length;
		for (int i = 0; i < seg_length; i++) {
			// System.out.println(segments[i]);
			if (segments[i].equals(id) && i != seg_length - 1) {
				segments[i + 1] = content;
			}
			if (segments[i].equals(id1) && i != seg_length - 1) {
				segments[i + 1] = content1;
			}
		}
//		for (String str : segments) {
//			System.out.println(str);
//		}
		for (int temp = 0; temp < segments.length; temp++) {
			str_result = str_result + segments[temp] + "\t";
			// p.println(str[temp]);
			// System.out.println(arr.get(temp));
		}
		return str_result;

	}

	public static void buildDataFile(String filename, ArrayList arr_str) throws IOException {
		// filename = "data1.txt";
		File file = new File(filename);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fs = new FileOutputStream(file, false);// ��true��Ϊfalse�������Ը��ǵķ�ʽд�����ݡ�
		// OutputStreamWriter out =new OutputStreamWriter(fs,"utf-8");//????
		// ������û������
		PrintStream p = new PrintStream(fs);
		for (int temp = 0; temp < arr_str.size(); temp++) {
			p.print(arr_str.get(temp));
			p.println();
			// p.println(str[temp]);
			// System.out.println(arr.get(temp));
		}
		
		p.close();
	}

}
