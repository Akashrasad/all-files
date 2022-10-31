package com.collection.collector;





public class Student1 {
	
	    int id;
	    String name;
	    String adress;
	    int zip;
	    
	    public Student1(int id, String name, String adress, int zip) {
			super();
			this.id = id;
			this.name = name;
			this.adress = adress;
			this.zip = zip;
		}
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
	    public String getAdress() {
	        return adress;
	    }
	    public void setAdress(String adress) {
	        this.adress = adress;
	    }
	    public int getZip() {
	        return zip;
	    }
	    public void setZip(int zip) {
	        this.zip = zip;
	    }



	}