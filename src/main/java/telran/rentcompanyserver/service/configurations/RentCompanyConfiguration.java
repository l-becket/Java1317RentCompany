package telran.rentcompanyserver.service.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.rentcompanyserver.service.IRentCompany;
import telran.rentcompanyserver.service.RentCompanyEmbedded;

@Configuration
public class RentCompanyConfiguration
{
	@Value("${fileName:company.data}")
	private String fileName;
	
	@Bean
	IRentCompany getRentCompany()
	{
		return RentCompanyEmbedded.restoreFromFile(fileName);
	}
}
