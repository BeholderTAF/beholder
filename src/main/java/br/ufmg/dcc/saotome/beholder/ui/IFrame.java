/*  Copyright 2014 Ícaro Clever da Fonseca Braga

	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.
 */
package br.ufmg.dcc.saotome.beholder.ui;

/**
 * Interface to represent HTML modal frames and iframes.
 * The tester must implement a class with the components of the modal and
 * instantiate a Modal generic implementation, passing the Test Interface
 * created as a class parameter.
 * The interface set and get in this class can be any class that you want
 * encapsule inside of a IFrame to represent a screen loaded inside of an 
 * Iframe.
 * @author icaroclever
 */
public interface IFrame extends Component, ComponentAgregator{
	
	/**
	 * Getter to the interface.
	 * @return Returs the interface class informed.
	 */
	<T> T getInterface();
	
	/**
	 * Setter to the interface
	 * @param testInterface
	 */
	<T> void setInterface(T testInterface);
}
