package com.gfi.PruebaNumero22.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;


import com.gfi.PruebaNumero22.dto.PruebaNumero22Dto;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/undefined")
@Api(value="undefined", description="undefined repository")
public class PruebaNumero22Controller {


	@ApiOperation(value = "get undefined")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public PruebaNumero22Dto getExample(@PathVariable("id") String id) {
	//TODO: PENDIENTE IMPLEMENTACION DESARROLLO		
		log.debug("ejemplo log con slf4j");

		PruebaNumero22Dto dtoExample = new PruebaNumero22Dto();
		return dtoExample;
	}

}
