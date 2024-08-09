package in.chittimella.csvtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chittimella.csvtodb.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer>{

	
}
