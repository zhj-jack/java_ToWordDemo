import java.io.*;
import java.util.*;

import freemarker.template.Configuration;
import freemarker.template.Template;

//封装接口
public class Demo {
	public static void main(String[] args) throws Exception {
//		NodeModel tob= NodeModel.parse(new File("D:\\BF\\Desktop\\test.xml"));
		DModel user =new DModel();
		user.setName("test");
		user.setFname("test");
		user.setLname("test");
		user.setAday("1");
		user.setAddress("test");
		user.setAge("100");
		user.setAmonth("1");
		user.setAyear("1");
		user.setEmail("sss1");
		user.setLast_company("sss2");
		user.setLast_education("sss3");
		user.setLast_exp_month("sss4");
		user.setLast_exp_year("sss5");
		user.setLast_heducation("sss6");
		user.setLast_industry("sss7");
		user.setLast_major("sss8");
		user.setLast_position("sss9");
		user.setLast_school("sss10");
		user.setNow_income("100000");
		user.setSex("man");
		user.setWkstate("sss");
		user.setPhone("12345678");
		user.setId("pc9527");
		user.setExp("10");
		Map tmp =new HashMap(); 
		tmp.put("user", user);
		
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_27);
		configuration.setDefaultEncoding("utf-8");
		//利用模板数据生成test3
		File file =new File("D:\\BF\\Desktop\\test\\test3.xml");
		configuration.setDirectoryForTemplateLoading(new File("D:\\BF\\Desktop\\test\\"));
		Template template = configuration.getTemplate("test3.xml");
		File outFile = new File("D:\\BF\\Desktop\\test\\test3.doc");
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));
		template.process(tmp, out);
		out.flush();
		out.close();
		
	}
	
}
