package com.sap.cloud.security.cas.client;


import java.net.URI;

/**
 * TODO: extract as library
 */
public interface ADCService {
    ADCServiceResponse isUserAuthorized(URI adcUri, ADCServiceRequest request);

    boolean ping(URI adcUri);
}