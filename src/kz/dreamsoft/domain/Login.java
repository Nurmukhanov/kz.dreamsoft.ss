package kz.dreamsoft.domain;

import java.io.Serializable;

import javax.servlet.http.HttpSession;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import kz.dreamsoft.domain.beans.SessionBean;
import kz.dreamsoft.repository.LoginDAO;

@ManagedBean
@SessionScoped
public class Login extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1094801825228386363L;
	
	private String user;
	private String pwd;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//Validate login
	 public String validateUsernamePassword() {
	        boolean valid = LoginDAO.validate(user, pwd);
	        if (valid) {
	            HttpSession session = SessionBean.getSession();
	            session.setAttribute("username", user);
	            return "admin";
	        } else {
	            FacesContext.getCurrentInstance().addMessage(
	                    null,
	                    new FacesMessage(FacesMessage.SEVERITY_WARN,
	                            "Incorrect Username and Passowrd",
	                            "Please enter correct username and Password"));
	            return "login";
	        }
	 }
}
