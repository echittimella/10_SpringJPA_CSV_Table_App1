package in.chittimella.csvtodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.chittimella.csvtodb.service.CSVService;

@RestController
public class CSVController {

	@Autowired
	private CSVService csvService;
	
	
//  http://localhost:9992/import-csv?filePath=C://software//SBMS_Workspace//10_SpringJPA_CSV_Table_App1//shop.csv

	@GetMapping("/import-csv")
	 public String importCsv(@RequestParam String filePath) {	
		
		csvService.saveCsvData(filePath);
        return "CSV data imported successfully!";
	}

}
