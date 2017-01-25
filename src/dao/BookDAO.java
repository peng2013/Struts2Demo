package dao;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDAO {
	//定义一个保存图书信息的静态Map对象
	private static Map<String,Integer> books=new LinkedHashMap<String,Integer>();
	//在静态块中对Map对象进行初始化，Map的key表示书名，Map的value表示价格
	static
	{
		books.put("J2EE整合详解与典型案例", 79);
		books.put("ViSUAL C# 2008开发技术详解", 89);
		books.put("STRUTS2技术详解", 69);
		books.put("ASP经典模块开发大全", 69);
		books.put("ASP.NET 3.5网络数据库开发实例自学手册", 79);
		books.put("XML开发典型应用", 65);
		books.put("JAVA自学", 100);
		books.put("JAVA 20 天", 600);
	}
	//根据书名进行模糊查询，返回用于保存查询结果的Map对象
	public Map<String,Integer> getBooks(String name){
		//定义一个保存查询结果的books对象
		Map<String,Integer> books=new LinkedHashMap<String, Integer>();
		//对BookDAO.books对象进行扫描，查询满足条件的结果
		for(Map.Entry<String, Integer> entry:BookDAO.books.entrySet()){
			//将key和name都转换成小写后，使用contains方法进行查询
			if(entry.getKey().toLowerCase().contains(name.toLowerCase()))
				books.put(entry.getKey(), entry.getValue());
			//找到后，将key和value加到books中
		}
		return books;
	}
	

}
