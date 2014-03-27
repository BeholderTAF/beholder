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
package br.ufmg.dcc.saotome.beholder.ui.event;

/** Represents classes which can hide and display elements after the 
 * page loading is completed.
 * @author icaroclever
 */
public interface Displayable {
	
	/** Changes the state of the object, shows it on the interface.
	 * Case it is already displayed, the method does nothing.
	 */
	void show();
	
	/** Returns if the component is displayable or not.
	 * @return true if the component is displayed or false if it's not. 
	 */
	boolean isDisplayed();
	
	/** Changes the state of the object, hides it on the interface or switching it to a parent context that loaded it.
	 * Case it is already hidden, the method does nothing.
	 */
	void hide();

}
