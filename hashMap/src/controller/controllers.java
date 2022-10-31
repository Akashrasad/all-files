package controller;

import java.util.Map;

import com.clashashMap.callMap;
import com.repo.repo;

public class controllers {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public callMap getMap() {
		return map;
	}
	public void setMap(callMap map) {
		this.map = map;
	}
	int id;
	String name;
	callMap map=new callMap();
	//Map.Entry<Integer, String>entry
	public repo myrepo;
	public repo getMyrepo() {
		return myrepo;
	}
	public void setMyrepo(repo myrepo) {
		this.myrepo = myrepo;
	}
//	@Override
//	public String toString() {
//		return "controllers [id=" + id + ", name=" + name + "]";
//	}
////	
//	@Override
//	public String toString() {
//		return "controllers [id=" + id + ", name=" + name + ", map=" + map + ", myrepo=" + myrepo + ", getId()="
//				+ getId() + ", getName()=" + getName() + ", getMap()=" + getMap() + ", getMyrepo()=" + getMyrepo()
//				+ "]";
//	}
	@Override
	public String toString() {
		return "controllers [id=" + id + ", name=" + name + ", map=" + map + ", myrepo=" + myrepo + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getMap()=" + getMap() + ", getMyrepo()=" + getMyrepo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
