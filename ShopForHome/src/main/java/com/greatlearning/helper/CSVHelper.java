package com.greatlearning.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.greatlearning.entity.product;

public class CSVHelper {
	public static String TYPE = "text/csv";
	static String[] HEADERs = {"ProductName","Price","Stock","Description","ProductIcon","CategoryType"};
	public static int hasCSVFormat(MultipartFile file) {
		System.out.println(file.getContentType());
		System.out.println("Inside ");
		if(!TYPE.equals(file.getContentType())) {
			System.out.println("Inside hasCSVformat");
			
			return 0;
		}
		return 1;
	}
	public static List<product> csvToTutorials(InputStream is){
		Date date = Date.valueOf(LocalDate.now());
		try( BufferedReader fileReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
						){
			List<product> productList = new ArrayList<product>();
			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			for(CSVRecord csvRecord : csvRecords) {
				System.out.println(csvRecord);
				product product = new product(
				csvRecord.get("CategoryType"),
				date,
				csvRecord.get("Description"),
				csvRecord.get("ProductIcon"),
				csvRecord.get("ProductName"),
				Float.parseFloat(csvRecord.get("Price")),
				0,
				Integer.parseInt(csvRecord.get("Stock")),
				date);
	    	  	productList.add(product);
			}return productList;
		}catch (IOException e) {
			throw new RuntimeException("fail to parse Csv file : " + e.getMessage());
		}
				
	}
}
