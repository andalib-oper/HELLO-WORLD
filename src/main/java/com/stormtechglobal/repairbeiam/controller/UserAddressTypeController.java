package com.stormtechglobal.repairbeiam.controller;

import com.stormtechglobal.repairbeiam.dto.UserAddressTypeRequestDto;
import com.stormtechglobal.repairbeiam.dto.UserAddressTypeResponseDto;
import com.stormtechglobal.repairbeiam.service.UserAddressTypeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/useraddresstype", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserAddressTypeController {
    @Inject private UserAddressTypeService service;
    @ApiOperation(value = "Create a user address type", notes = "API for creating a new user address type")
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
    public UserAddressTypeResponseDto create(@RequestBody UserAddressTypeRequestDto userAddressTypeRequestDto) throws Exception {
        return service.create(userAddressTypeRequestDto);
    }

    @ApiOperation(value = "Get all user address type", notes = "API for fetching all user address type")
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
    public List<UserAddressTypeResponseDto> getALl() {
        return service.getAll();
    }

    @DeleteMapping(value="Delete user address by id")
    public UserAddressTypeResponseDto deleteUserAddressType(@PathVariable("id") UUID id) {
        return service.deleteById(id);
    }

}
    
    
