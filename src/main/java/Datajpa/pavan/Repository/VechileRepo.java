package Datajpa.pavan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Datajpa.pavan.Model.Vechile;

public interface VechileRepo extends JpaRepository<Vechile, Integer> {
	//select*from Vechile where ename="car"
	public List<Vechile> findByModel_Name(String model_Name);
	
	// select *from Vechile where vechile_color="black";
	public List<Vechile>  findByVechile_color(String vechile_color);

	public List<Vechile> findByModel_Name1(String model_Name);
	


}
