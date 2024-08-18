package Datajpa.pavan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vechile {
private String Model_Name;
@Id
private Integer vechile_id;
private String Vechile_color;

	
public Vechile() {
	
}


public Vechile(String model_Name, Integer vechile_id, String vechile_color) {
	
	this.Model_Name = model_Name;
	this.vechile_id = vechile_id;
	this.Vechile_color = vechile_color;
}


public String getModel_Name() {
	return Model_Name;
}
public void setModel_Name(String model_Name) {
	Model_Name = model_Name;
}
public Integer getVechile_id() {
	return vechile_id;
}
public void setVechile_id(Integer vechile_id) {
	this.vechile_id = vechile_id;
}
public String getVechile_color() {
	return Vechile_color;
}
public void setVechile_color(String vechile_color) {
	Vechile_color = vechile_color;
}
@Override
public String toString() {
	return "Vechile [Model_Name=" + Model_Name + ", vechile_id=" + vechile_id + ", Vechile_color=" + Vechile_color
			+ "]";
}


}
