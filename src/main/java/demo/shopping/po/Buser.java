package demo.shopping.po;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Buser {
	private Integer id;
	@Email//邮箱验证
	private String bemail;
	@NotBlank//验证不为空
	private String bpwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	public String getBpwd() {
		return bpwd;
	}
	public void setBpwd(String bpwd) {
		this.bpwd = bpwd;
	}
}
