package childns;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Namespace;
//ָ��������parentns
@ParentPackage(value="parents")
//ָ�������ռ���/mychile
@Namespace(value="/mychild")
//ָ���������
@Results({@Result(name="success",location="/success.jsp"),@Result(name="error",location="/error.jsp")})
public class ChildAction {
	//���������߼���execute����
	public String execute(){
		try{
			System.out.println("child");
			return "success";//����success���
		}catch (Exception e) {
			return "error";//����error���
		}
	}

}
