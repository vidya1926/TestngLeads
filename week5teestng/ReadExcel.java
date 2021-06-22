package week5teestng;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] exceldata(String filename) throws IOException {
	
	XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rowCount=ws.getLastRowNum();
	int cellCount=ws.getRow(1).getLastCellNum();
	String[][] data=new String[rowCount][cellCount];
	for(int i=1;i<=rowCount;i++)
	{for (int j=0;j<cellCount;j++)
	{
		String Text=ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(Text);
		data[i-1][j]=Text;
		
	}
	}
	wb.close();

	return data;
}


}
