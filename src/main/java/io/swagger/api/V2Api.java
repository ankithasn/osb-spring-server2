/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.30-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AsyncOperation;
import io.swagger.model.Catalog;
import io.swagger.model.Error;
import io.swagger.model.LastOperationResource;
import io.swagger.model.ServiceBindingRequest;
import io.swagger.model.ServiceBindingResource;
import io.swagger.model.ServiceBindingResponse;
import io.swagger.model.ServiceInstanceAsyncOperation;
import io.swagger.model.ServiceInstanceProvisionRequest;
import io.swagger.model.ServiceInstanceProvisionResponse;
import io.swagger.model.ServiceInstanceResource;
import io.swagger.model.ServiceInstanceUpdateRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-02T18:12:04.491+05:30")

@Validated
@Api(value = "v2", description = "the v2 API")
@RequestMapping(value = "")
public interface V2Api {

    @ApiOperation(value = "get the catalog of services that the service broker offers", nickname = "catalogGet", notes = "", response = Catalog.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Catalog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "catalog response", response = Catalog.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/catalog",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Catalog> catalogGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity);


    @ApiOperation(value = "generation of a service binding", nickname = "serviceBindingBinding", notes = "", response = ServiceBindingResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceBindings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceBindingResponse.class),
        @ApiResponse(code = 201, message = "Created", response = ServiceBindingResponse.class),
        @ApiResponse(code = 202, message = "Accepted", response = AsyncOperation.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 410, message = "Gone", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ServiceBindingResponse> serviceBindingBinding(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "parameters for the requested service binding" ,required=true )  @Valid @RequestBody ServiceBindingRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @ApiOperation(value = "gets a service binding", nickname = "serviceBindingGet", notes = "", response = ServiceBindingResource.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceBindings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceBindingResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ServiceBindingResource> serviceBindingGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId);


    @ApiOperation(value = "last requested operation state for service binding", nickname = "serviceBindingLastOperationGet", notes = "", response = LastOperationResource.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceBindings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LastOperationResource.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 410, message = "Gone", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}/last_operation",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<LastOperationResource> serviceBindingLastOperationGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId,@ApiParam(value = "a provided identifier for the operation") @Valid @RequestParam(value = "operation", required = false) String operation);


    @ApiOperation(value = "deprovision of a service binding", nickname = "serviceBindingUnbinding", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceBindings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 202, message = "Accepted", response = AsyncOperation.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 410, message = "Gone", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/service_bindings/{binding_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Object> serviceBindingUnbinding(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "binding id of binding to create",required=true) @PathVariable("binding_id") String bindingId,@NotNull @ApiParam(value = "id of the service associated with the instance being deleted", required = true) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @ApiParam(value = "id of the plan associated with the instance being deleted", required = true) @Valid @RequestParam(value = "plan_id", required = true) String planId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @ApiOperation(value = "deprovision a service instance", nickname = "serviceInstanceDeprovision", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceInstances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 202, message = "Accepted", response = AsyncOperation.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 410, message = "Gone", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Object> serviceInstanceDeprovision(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@NotNull @ApiParam(value = "id of the service associated with the instance being deleted", required = true) @Valid @RequestParam(value = "service_id", required = true) String serviceId,@NotNull @ApiParam(value = "id of the plan associated with the instance being deleted", required = true) @Valid @RequestParam(value = "plan_id", required = true) String planId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @ApiOperation(value = "gets a service instance", nickname = "serviceInstanceGet", notes = "", response = ServiceInstanceResource.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceInstances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceInstanceResource.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ServiceInstanceResource> serviceInstanceGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId);


    @ApiOperation(value = "last requested operation state for service instance", nickname = "serviceInstanceLastOperationGet", notes = "", response = LastOperationResource.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceInstances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LastOperationResource.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 410, message = "Gone", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}/last_operation",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<LastOperationResource> serviceInstanceLastOperationGet(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "id of the service associated with the instance") @Valid @RequestParam(value = "service_id", required = false) String serviceId,@ApiParam(value = "id of the plan associated with the instance") @Valid @RequestParam(value = "plan_id", required = false) String planId,@ApiParam(value = "a provided identifier for the operation") @Valid @RequestParam(value = "operation", required = false) String operation);


    @ApiOperation(value = "provision a service instance", nickname = "serviceInstanceProvision", notes = "", response = ServiceInstanceProvisionResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceInstances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ServiceInstanceProvisionResponse.class),
        @ApiResponse(code = 201, message = "Created", response = ServiceInstanceProvisionResponse.class),
        @ApiResponse(code = 202, message = "Accepted", response = ServiceInstanceAsyncOperation.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ServiceInstanceProvisionResponse> serviceInstanceProvision(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "parameters for the requested service instance provision" ,required=true )  @Valid @RequestBody ServiceInstanceProvisionRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);


    @ApiOperation(value = "update a service instance", nickname = "serviceInstanceUpdate", notes = "", response = Object.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceInstances", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class),
        @ApiResponse(code = 202, message = "Accepted", response = ServiceInstanceAsyncOperation.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 412, message = "Precondition Failed", response = Error.class),
        @ApiResponse(code = 422, message = "Unprocessable Entity", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected", response = Error.class) })
    @RequestMapping(value = "/v2/service_instances/{instance_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Object> serviceInstanceUpdate(@ApiParam(value = "version number of the Service Broker API that the Platform will use" ,required=true) @RequestHeader(value="X-Broker-API-Version", required=true) String xBrokerAPIVersion,@ApiParam(value = "instance id of instance to provision",required=true) @PathVariable("instance_id") String instanceId,@ApiParam(value = "parameters for the requested service instance update" ,required=true )  @Valid @RequestBody ServiceInstanceUpdateRequest body,@ApiParam(value = "identity of the user that initiated the request from the Platform" ) @RequestHeader(value="X-Broker-API-Originating-Identity", required=false) String xBrokerAPIOriginatingIdentity,@ApiParam(value = "idenity of the request from the Platform" ) @RequestHeader(value="X-Broker-API-Request-Identity", required=false) String xBrokerAPIRequestIdentity,@ApiParam(value = "asynchronous operations supported") @Valid @RequestParam(value = "accepts_incomplete", required = false) Boolean acceptsIncomplete);

}
