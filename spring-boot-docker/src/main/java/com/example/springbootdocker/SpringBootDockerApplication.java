package com.example.springbootdocker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@Setter
@Getter
public class EvalBean {
	public EvalBean() throws ClassNotFoundException {
		System.out.println("[+] 调⽤了EvalBean.EvalBean");
	}

	public String name;
	public CommonBean commonBean;

	public String getName() {
		System.out.println("[+] 调⽤了EvalBean.getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("[+] 调⽤了EvalBean.setName");
		this.name = name;
	}

	public CommonBean getCommonBean() {
		System.out.println("[+] 调⽤了EvalBean.getCommonBean");
		return commonBean;
	}

	public void setCommonBean(CommonBean commonBean) {
		System.out.println("[+] 调⽤了EvalBean.setCommonBean");
		this.commonBean = commonBean;
	}
}

@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

	@RequestMapping("/")
	String home(EvalBean evalBean) {
		System.out.println(evalBean);
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}