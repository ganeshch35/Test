package com.app.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupFilesFromFolder {

	public static void main(String[] args) throws IOException {
		try {
		File dir = new File("E:\\ALL PDFS");
		File[] files = dir.listFiles();
		int count=files.length;
		System.out.println("File count is::"+count);
		Map<Date, List<File>> map = new LinkedHashMap<>();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		for (File f : files) {
			try {
		        Date date = sdf.parse(sdf.format(new Date(f.lastModified())));
		        List<File> list = map.get(date);
		        if (list == null) {
		        	list = new ArrayList<>();
		            map.put(date, list);
		        }
		        list.add(f);
		    } catch (ParseException ex) {
		        ex.printStackTrace();
		    }
		}
		for (Date date : map.keySet()) {
		    System.out.println(sdf.format(date));
		    for (File file : map.get(date)) {
		       System.out.println("    " + file);
		    }
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

