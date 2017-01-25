package dao;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDAO {
	//����һ������ͼ����Ϣ�ľ�̬Map����
	private static Map<String,Integer> books=new LinkedHashMap<String,Integer>();
	//�ھ�̬���ж�Map������г�ʼ����Map��key��ʾ������Map��value��ʾ�۸�
	static
	{
		books.put("J2EE�����������Ͱ���", 79);
		books.put("ViSUAL C# 2008�����������", 89);
		books.put("STRUTS2�������", 69);
		books.put("ASP����ģ�鿪����ȫ", 69);
		books.put("ASP.NET 3.5�������ݿ⿪��ʵ����ѧ�ֲ�", 79);
		books.put("XML��������Ӧ��", 65);
		books.put("JAVA��ѧ", 100);
		books.put("JAVA 20 ��", 600);
	}
	//������������ģ����ѯ���������ڱ����ѯ�����Map����
	public Map<String,Integer> getBooks(String name){
		//����һ�������ѯ�����books����
		Map<String,Integer> books=new LinkedHashMap<String, Integer>();
		//��BookDAO.books�������ɨ�裬��ѯ���������Ľ��
		for(Map.Entry<String, Integer> entry:BookDAO.books.entrySet()){
			//��key��name��ת����Сд��ʹ��contains�������в�ѯ
			if(entry.getKey().toLowerCase().contains(name.toLowerCase()))
				books.put(entry.getKey(), entry.getValue());
			//�ҵ��󣬽�key��value�ӵ�books��
		}
		return books;
	}
	

}
