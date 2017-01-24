package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;

import dao.BookDAO;


public class QueryAction {
	public String execute(){
		try{
			//���HttpServletRequest����
			HttpServletRequest request=(HttpServletRequest) ActionContext.getContext()
			.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
			//���name����ֵ
			String name=request.getParameter("name");
			BookDAO book=new BookDAO();
			//����name��ֵ����ģ����ѯ
			Map<String, Integer> books=book.getBooks(name);
			//����ѯ����ŵ�request����
			request.setAttribute("result", books);
			return "result";
		}catch (Exception e) {
			return "error";
		}
		
	}

}
