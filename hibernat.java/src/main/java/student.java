
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class student
{
int Id;
String name;
String job;
@Id 
public int getId() {
	return Id;
}
public void setId(int Id) {
	this.Id = Id;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="job")
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
}
