package br.com.fiap.fiap_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FiapGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiapGatewayApplication.class, args);
	}

}
