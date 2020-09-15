package com.gura.spring04;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="hobby-list")
public class HobbyList {
	private List<String> hobby;
	
	@XmlElement
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
<<<<<<< HEAD
	public List<String> getHobby() {
		return hobby;
	}
}







=======
	
	public List<String> getHobby() {
		return hobby;
	}
}
>>>>>>> refs/remotes/origin/irene
