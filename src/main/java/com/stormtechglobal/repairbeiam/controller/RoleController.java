package com.stormtechglobal.repairbeiam.controller;

import com.stormtechglobal.repairbeiam.dto.RoleRequestDto;
import com.stormtechglobal.repairbeiam.dto.RoleResponseDto;
import com.stormtechglobal.repairbeiam.service.RoleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/role", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {
  @Inject private RoleService service;

  @ApiOperation(value = "Create a role", notes = "API for creating a new role")
  @ApiResponses(
      value = {
        @ApiResponse(code = 201, message = "CREATED"),
        @ApiResponse(code = 400, message = "BAD_REQUEST"),
        @ApiResponse(code = 422, message = "UNPROCESSABLE_ENTITY"),
        @ApiResponse(code = 500, message = "INTERNAL_SERVER_ERROR"),
        @ApiResponse(code = 403, message = "ACCESS_FORBIDDEN"),
        @ApiResponse(code = 401, message = "UNAUTHORIZED")
      })
  @PostMapping
  public RoleResponseDto create(@RequestBody RoleRequestDto roleRequestDto) throws Exception {
    return service.create(roleRequestDto);
  }

  @ApiOperation(value = "Get all role", notes = "API for fetching all role")
  @ApiResponses(
      value = {
        @ApiResponse(code = 200, message = "SUCCESS"),
        @ApiResponse(code = 400, message = "BAD_REQUEST"),
        @ApiResponse(code = 422, message = "UNPROCESSABLE_ENTITY"),
        @ApiResponse(code = 500, message = "INTERNAL_SERVER_ERROR"),
        @ApiResponse(code = 403, message = "ACCESS_FORBIDDEN"),
        @ApiResponse(code = 401, message = "UNAUTHORIZED")
      })
  @GetMapping
  public List<RoleResponseDto> getALl() {
    return service.getAll();
  }
}
