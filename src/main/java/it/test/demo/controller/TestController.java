package it.test.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Test controller")
public class TestController {
	private static Logger LOG = Logger.getLogger(TestController.class.getName());

	@ApiOperation(value = "This is just a test")
	@GetMapping("/test")
	public String getTest() {
		LOG.info("INIT getTest");
		return "Test dockerdemo 33";
	}

}
