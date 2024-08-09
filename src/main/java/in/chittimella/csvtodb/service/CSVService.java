package in.chittimella.csvtodb.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.chittimella.csvtodb.model.Shop;
import in.chittimella.csvtodb.repository.ShopRepository;

@Service
public class CSVService {

	@Autowired
	private ShopRepository shopRepository;

	@Transactional
	public void saveCsvData(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(","); // Assuming CSV is comma-separated
				Shop shop = new Shop();
				shop.setItemNumber(Integer.parseInt(data[0]));
				shop.setItemName(data[1]);
				shop.setItemPrice(Double.parseDouble(data[2]));

				shopRepository.save(shop);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
