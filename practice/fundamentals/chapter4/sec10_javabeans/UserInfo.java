package fundamentals.chapter4.sec10_javabeans;
/*
 * 次のユーザ情報クラスをJavaBeans仕様にしてください。
 */
public class UserInfo {
	private String userName;
	private String userPass;

	public UserInfo(String userName,String userPass) {
		this.userName = userName;
		this.userPass = userPass;
	}

	public UserInfo() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
}
