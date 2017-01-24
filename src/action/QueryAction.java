package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;

import dao.BookDAO;


public class QueryAction {
	public String execute(){
		try{
			//获得HttpServletRequest对象
			HttpServletRequest request=(HttpServletRequest) ActionContext.getContext()
			.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
			//获得name参数值
			String name=request.getParameter("name");
			BookDAO book=new BookDAO();
			//根据name的值进行模糊查询
			Map<String, Integer> books=book.getBooks(name);
			//将查询结果放到request域中
			request.setAttribute("result", books);
			return "result";
		}catch (Exception e) {
			return "error";
		}
		
	}

}
