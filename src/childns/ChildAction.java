package childns;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Namespace;
//指定父包是parentns
@ParentPackage(value="parents")
//指定命名空间是/mychile
@Namespace(value="/mychild")
//指定两个结果
@Results({@Result(name="success",location="/success.jsp"),@Result(name="error",location="/error.jsp")})
public class ChildAction {
	//处理请求逻辑的execute方法
	public String execute(){
		try{
			System.out.println("child");
			return "success";//返回success结果
		}catch (Exception e) {
			return "error";//返回error结果
		}
	}

}
