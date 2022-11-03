package api.employee.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import dto.EmpDashboardDetailsDto;
import dto.EmpDto;
import dto.comments;
import dto.products;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@JacksonStdImpl
public class handler 
{
	private WebClient client = WebClient.create("http://localhost:8082/empRestApi/");
	private WebClient jsonClient = WebClient.create("https://dummyjson.com/");

	@GetMapping("/getResponse")
	public String getResponse() 
	{
		return client.get().uri("asdf")
				.retrieve()
				.bodyToMono(String.class).block();
	}
	@GetMapping("/insert")
	public Boolean insertEmployee(@RequestBody EmpDto dto) 
	{
		System.out.println(dto.toString());
		return client.post().uri("insert")
			     .contentType(MediaType.APPLICATION_JSON)
//			     .syncBody(dto)
//				.body(dto,EmpDto.class)
//				.body(Mono.just(dto),EmpDto.class)
//				.body(BodyInserters.fromFormData(dto))
				.retrieve()
				.bodyToMono(boolean.class).block();
	}
	@GetMapping("/getEmp/{name}-{phone}")
	public Flux<EmpDashboardDetailsDto> getEmployee(@PathVariable("name") String name,@PathVariable("phone") int phone) 
	{
		return client.get().uri("getEmp/"+name+"-"+phone)
				.retrieve()
				.bodyToFlux(EmpDashboardDetailsDto.class);
	}
	@GetMapping("/getAllEmp")
	public Flux<EmpDashboardDetailsDto> getAllEmployee() 
	{
		return client.get().uri("getAllEmployee")
				.retrieve()
				.bodyToFlux(EmpDashboardDetailsDto.class);
	}
	@GetMapping("/jsonDumyProductData")
	public Flux<products> dumyData() 
	{
		return jsonClient.get().uri("products").retrieve().bodyToFlux(products.class);
	}
	@GetMapping("/jsonDumyProductData/{id}")
	public Mono<products> dumyData(@PathVariable("id") int id) 
	{
		return jsonClient.get().uri("products/"+id).retrieve().bodyToMono(products.class);
	}
	@GetMapping("/jsonDumyProductData/category/{category}")
	public Flux<products> dumyDataBySmartPhone(@PathVariable("category") String category) 
	{
		return jsonClient.get().uri("products/category/"+category).retrieve().bodyToFlux(products.class);
	}
	@GetMapping("/jsonDumyProductData/categories")
	public Flux<String> dumyCategoriesData() 
	{
		return jsonClient.get().uri("products/categories").retrieve().bodyToFlux(String.class);
	}
	
	@GetMapping("/jsonDumyCommentsData")
	public Flux<comments> dumyCommentsData()
	{
		return ((ResponseSpec) jsonClient.get().uri("comments").exchange()).bodyToFlux(comments.class);
	}
}