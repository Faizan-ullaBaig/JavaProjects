/**
 * CalculatorServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calc.ws;

public class CalculatorServiceImplServiceLocator extends org.apache.axis.client.Service implements com.calc.ws.CalculatorServiceImplService {

    public CalculatorServiceImplServiceLocator() {
    }


    public CalculatorServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatorServiceImpl
    private java.lang.String CalculatorServiceImpl_address = "http://localhost:8081/CalculatorServiceBottomUp/services/CalculatorServiceImpl";

    public java.lang.String getCalculatorServiceImplAddress() {
        return CalculatorServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatorServiceImplWSDDServiceName = "CalculatorServiceImpl";

    public java.lang.String getCalculatorServiceImplWSDDServiceName() {
        return CalculatorServiceImplWSDDServiceName;
    }

    public void setCalculatorServiceImplWSDDServiceName(java.lang.String name) {
        CalculatorServiceImplWSDDServiceName = name;
    }

    public com.calc.ws.CalculatorServiceImpl getCalculatorServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatorServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatorServiceImpl(endpoint);
    }

    public com.calc.ws.CalculatorServiceImpl getCalculatorServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.calc.ws.CalculatorServiceImplSoapBindingStub _stub = new com.calc.ws.CalculatorServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculatorServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatorServiceImplEndpointAddress(java.lang.String address) {
        CalculatorServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.calc.ws.CalculatorServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.calc.ws.CalculatorServiceImplSoapBindingStub _stub = new com.calc.ws.CalculatorServiceImplSoapBindingStub(new java.net.URL(CalculatorServiceImpl_address), this);
                _stub.setPortName(getCalculatorServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatorServiceImpl".equals(inputPortName)) {
            return getCalculatorServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.calc.com", "CalculatorServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.calc.com", "CalculatorServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatorServiceImpl".equals(portName)) {
            setCalculatorServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
