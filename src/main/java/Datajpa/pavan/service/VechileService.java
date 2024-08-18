package Datajpa.pavan.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Datajpa.pavan.Model.Vechile;
import Datajpa.pavan.Repository.VechileRepo;
@Service
public class VechileService {
	private VechileRepo vechilerepo;
	public VechileService(VechileRepo vechilerepo) {
		this.vechilerepo=vechilerepo;
	}
	public void callFindByMethods() {
		List<Vechile> acho=vechilerepo.findByModel_Name("kia");
		acho.forEach(e -> System.out.println(e));
	}
	
	public void checkVechile_Id(Integer id) {
		boolean exits=vechilerepo.existsById(id);
		if(exits) {
			System.out.println("the id is available in database table"+id);
		}
		else {
			System.out.println("the id is not available in the database table"+id);
		}
	}
	public void getem() {
	Iterable<Vechile>	pavan=vechilerepo.findAll();
	pavan.forEach(System.out::println);
	}
	
	public void getEmps(List<Integer> eids) {
		Iterable<Vechile> emps=vechilerepo.findAllById(eids);
		emps.forEach(e ->System.out.println(e));
		
	}
	public void getEmp(Integer eid) {
		Optional<Vechile> findById=vechilerepo.findById(eid);
		if(findById.isPresent()) {
			Vechile vec=findById.get();
			System.out.println(vec);
		}
		else {
			System.out.println("record not found");
		}
	}
	
	public void saveEmps() {
		Vechile v1=new Vechile("BMW",1,"black");
		Vechile v2=new Vechile("kia",2,"white");
		Vechile v3=new Vechile("Tata",3,"Red");
		List<Vechile>emps=Arrays.asList(v1,v2,v3);
		vechilerepo.saveAll(emps);
		System.out.println("records are saved");
	}
	
	
	public void saveVechile() {
		Vechile v=new Vechile();
		v.setModel_Name("Audi");
		v.setVechile_color("pink");
		v.setVechile_id(3);
		vechilerepo.save(v);
		System.out.println("record has been saved");
	}

}
