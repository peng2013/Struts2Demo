package parentns;

public class ParentAction {
	//处理请求逻辑的execute方法
	public String execute(){
		System.out.println("parent");
		return null;//返回null，表示并不使用任何结果
	}

}
