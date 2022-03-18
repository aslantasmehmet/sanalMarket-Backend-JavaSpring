package kodlamaio.sanalMarket.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.sanalMarket.entities.concretes.District;

public interface DistrictDao extends JpaRepository<District, Integer> {
	
	List<District> getByTownId (int townId);

}
